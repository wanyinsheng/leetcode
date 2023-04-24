package leet_202304;

import java.util.*;

/**
 * 721. 账户合并
 *
 * @Author wanys
 * @Date 2023/4/24 15:15
 * @Version 1.0
 **/
public class AccountsMerge {
    /**
     * 哈希表 + 并查集
     * 两个账户需要合并，当且仅当两个账户至少有一个共同的邮箱地址，因此这道题的实质是判断所有的邮箱地址中有哪些邮箱地址必定属于同一人，可以使用并查集实现。
     * 为了使用并查集实现账户合并，需要知道一共有多少个不同的邮箱地址，以及每个邮箱对应的名称，因此需要使用两个哈希表分别记录每个邮箱对应的编号和每个邮箱对应的名称
     */
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> result = new ArrayList<>();
        Map<String, Integer> emailToIndex = new HashMap<String, Integer>();
        Map<String, String> emailToName = new HashMap<String, String>();

        int emailsCount = 0;//全局索引
        for (List<String> account : accounts) {
            String name = account.get(0);
            int size = account.size();
            for (int i = 1; i < size; i++) {
                String email = account.get(i);
                if (!emailToIndex.containsKey(email)) {
                    emailToIndex.put(email, emailsCount++);//每put一个邮箱，索引加加
                    emailToName.put(email, name);
                }
            }
        }
        //做出并查集
        UnionFind uf = new UnionFind(emailsCount);
        for (List<String> account : accounts) {
            String firstEmail = account.get(1);
            int firstIndex = emailToIndex.get(firstEmail);
            int size = account.size();
            for (int i = 2; i < size; i++) {
                String nextEmail = account.get(i);
                int nextIndex = emailToIndex.get(nextEmail);
                //合并
                uf.union(firstIndex, nextIndex);
            }
        }
        Map<Integer, List<String>> indexToEmails = new HashMap<Integer, List<String>>();
        for (String email : emailToIndex.keySet()) {
            int index = uf.find(emailToIndex.get(email));
            List<String> account = indexToEmails.getOrDefault(index, new ArrayList<String>());
            account.add(email);
            indexToEmails.put(index, account);
        }
        List<List<String>> merged = new ArrayList<List<String>>();
        for (List<String> emails : indexToEmails.values()) {
            Collections.sort(emails);
            String name = emailToName.get(emails.get(0));
            List<String> account = new ArrayList<String>();
            account.add(name);
            account.addAll(emails);
            merged.add(account);
        }
        return merged;
    }

    class UnionFind {
        int[] parent;

        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public void union(int index1, int index2) {
            parent[find(index2)] = find(index1);
        }

        public int find(int index) {
            if (parent[index] != index) {
                parent[index] = find(parent[index]);
            }
            return parent[index];
        }
    }
}
