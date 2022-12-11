package leet_202206;

/**
 * 剑指 Offer II 034. 外星语言是否排序
 * @Author wanys
 * @Date 2022/6/6 11:00 PM
 * @Version 1.0
 **/
public class IsAlienSorted {

    public boolean isAlienSorted(String[] words, String order) {
        int[] index = new int[26];
        //根据字典序建立索引
        for (int i = 0; i < order.length(); ++i) {
            index[order.charAt(i) - 'a'] = i;
        }
        for (int i = 1; i < words.length; i++) {
            boolean valid = false;
            for (int j = 0; j < words[i - 1].length() && j < words[i].length(); j++) {
                //将字符转成索引
                int prev = index[words[i - 1].charAt(j) - 'a'];
                int curr = index[words[i].charAt(j) - 'a'];
                //比较索引
                if (prev < curr) {
                    valid = true;
                    break;
                } else if (prev > curr) {
                    return false;
                }
            }
            if (!valid) {
                /* 比较两个字符串的长度 */
                if (words[i - 1].length() > words[i].length()) {
                    return false;
                }
            }
        }
        return true;

    }

}
