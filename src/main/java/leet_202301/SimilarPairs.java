package leet_202301;

import java.util.HashMap;
import java.util.Map;

/**
 * 2506. 统计相似字符串对的数目
 * @Author wanys
 * @Date 2023/1/8 09:27
 * @Version 1.0
 **/
public class SimilarPairs {
    public int similarPairs(String[] words) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(String word:words){
            int state = 0;//利用位运算
            for (int i = 0; i <word.length() ; i++) {
                state |= (1 << (word.charAt(i) - 'a'));
            }
            map.merge(state,1,Integer::sum);
        }
        int ans=0;
        for (int cnt : map.values()) {
            ans += cnt * (cnt - 1) / 2;
        }
        return ans;



    }
}
