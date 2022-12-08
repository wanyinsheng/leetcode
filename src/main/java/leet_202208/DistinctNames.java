package leet_202208;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author wanys
 * @Date 2022/8/1 11:12
 * @Version 1.0
 **/
public class DistinctNames {
    public long distinctNames(String[] ideas) {
        Map<String, Integer> group = new HashMap<String, Integer>();
        for (String s : ideas) {
            String t = s.substring(1);
            group.put(t, group.getOrDefault(t, 0) | 1 << (s.charAt(0) - 'a'));
        }
        long ans = 0L;
        int[][] cnt = new int[26][26];

        for (int mask : group.values())
            for (int i = 0; i < 26; i++)
                if ((mask >> i & 1) == 0) {
                    for (int j = 0; j < 26; j++)
                        if ((mask >> j & 1) > 0)
                            ++cnt[i][j];
                } else {
                    for (int j = 0; j < 26; j++)
                        if ((mask >> j & 1) == 0)
                            ans += cnt[i][j];
                }
        return ans * 2;



    }
}
