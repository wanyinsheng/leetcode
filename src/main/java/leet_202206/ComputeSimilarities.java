package leet_202206;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 面试题 17.26. 稀疏相似度
 * @Author wanys
 * @Date 2022/6/6 10:03 PM
 * @Version 1.0
 **/
public class ComputeSimilarities {
    public List<String> computeSimilarities(int[][] docs) {
        List<String> ans = new ArrayList<>();
        //构造倒排索引
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        //统计每个文档中，每个单词出现的个数
        int[][] help = new int[docs.length][docs.length];
        for (int i = 0; i <docs.length ; i++) {
            for (int j = 0; j <docs[i].length ; j++) {
                //放到倒排索引的map中
                List<Integer> list = map.get(docs[i][j]);
                if (list == null) {
                    list = new ArrayList<>();
                    map.put(docs[i][j], list);
                } else {
                    for (Integer k : list) {
                        help[i][k]++;//该单词个数加一
                    }
                }
                list.add(i);
            }
            for (int k = 0; k < docs.length; k++) {
                if (help[i][k] > 0) {
                    ans.add(k + "," + i + ": " + String.format("%.4f", (double) help[i][k] / (docs[i].length + docs[k].length - help[i][k])));
                }
            }
        }
        return  ans;


    }
}
