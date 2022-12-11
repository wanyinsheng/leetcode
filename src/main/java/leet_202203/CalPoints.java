package leet_202203;

import java.util.ArrayList;

/**
 * 682. 棒球比赛
 *
 * @Author wanys
 * @Date 2022/3/28 11:44 PM
 * @Version 1.0
 **/
public class CalPoints {
    public int calPoints(String[] ops) {
        int result = 0;


        ArrayList<Integer> list = new ArrayList<Integer>();
        for (String op : ops) {
            int index = list.size();
            switch (op.charAt(0)) {
                case '+':
                    result += list.get(index - 1) + list.get(index - 2);
                    list.add(list.get(index - 1) + list.get(index - 2));
                    break;
                case 'D':
                    result += 2 * list.get(index - 1);
                    list.add(list.get(index - 1) * 2);
                    break;
                case 'C':
                    result -= list.get(index - 1);
                    list.remove(index - 1);//从list中移除
                    break;
                default:
                    result += Integer.parseInt(op);
                    list.add(Integer.parseInt(op));
                    break;
            }

        }
        return result;
    }

}
