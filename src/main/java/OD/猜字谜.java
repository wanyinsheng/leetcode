package OD;

import java.util.*;

/**
 * @Author wanys
 * @Date 2023/3/21 12:16
 * @Version 1.0
 **/
public class 猜字谜 {
    public static void main(String[] args) {
        //谜面
        String[] conunrums = new String().split(",");
        //谜底
        String[] results = new String().split(",");

        List<String> list = new ArrayList<>();

        for (int m = 0; m < conunrums.length; m++) {
            //得到谜面
            String conunrum = conunrums[m];
            //是否存在谜底的变量
            boolean isExist = false;

            for (int n = 0; n < results.length; n++) {
                //得到谜底
                String result = results[n];
                if (sort(conunrum, result)) {//判断排序之后是否一样
                    list.add(result);
                    isExist = true;
                } else if (unique(conunrum, result)) {//去重后是否一样
                    list.add(result);
                    isExist = true;
                }
            }
            if (!isExist) {
                list.add("not found");
            }
            //最后将list转成逗号分隔的字符串输出，利用for循环

        }

    }

    private static boolean sort(String conunrum, String result) {
        char[] conunrums = conunrum.toCharArray();
        char[] results = result.toCharArray();
        Arrays.sort(conunrums);
        Arrays.sort(results);
        return Arrays.equals(conunrums, results);
    }

    private static boolean unique(String conunrum, String result) {
        //用两个list判断去重后的集合是否相等

        //用两个set判断是否相等（去重后）
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        return set1.equals(set2);
    }
}
