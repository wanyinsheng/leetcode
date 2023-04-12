package OD;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author wanys
 * @Date 2023/4/8 15:45
 * @Version 1.0
 **/
public class 斗地主 {
    static String[] mGraph = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myValue = scanner.nextLine();
        String overValue = scanner.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        //每张卡牌有四个
        for (String s : mGraph) {
            map.put(s, 4);
        }
        //除去自己手上的牌还有已经下过的牌
        valueDiff(map, myValue);
        valueDiff(map, overValue);
        //在剩余的牌中找顺子
        String res = find(map);
        System.out.println(res);
    }

    public static String find(Map<String, Integer> map) {
        String res = "NO_CHAIN";
        int l=0;
        int r = 0;
        for (int i = 0; i < mGraph.length; i++) {
            String card = mGraph[i];
            if (map.get(card) > 0) {
                l = i;
                while (i < mGraph.length - 1 && map.get(mGraph[i + 1]) > 0) {
                    i++;

                }
                r = i + 1;
            }
        }
        if (r - l >= 5) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = l; i < r; i++) {
                stringBuilder.append(mGraph[i]).append("-");
            }
            if (stringBuilder.length() > 0) {
                res = stringBuilder.substring(0, stringBuilder.length() - 1);
            }
        }
        return res;
    }

    //除去自己手上shu的牌还有已经下过的牌
    public static void valueDiff(Map<String, Integer> map, String str) {
        for (String card : str.split("-")) {
            if (map.containsKey(card)) {
                map.put(card, map.get(card) - 1);
            }
        }
    }
}
