package leet_202207;

import java.util.ArrayList;
import java.util.List;

/**
 * 401. 二进制手表
 * @Author wanys
 * @Date 2022/7/1 2:59 PM
 * @Version 1.0
 **/
public class ReadBinaryWatch {

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<String>();
        for (int h = 0; h < 12; ++h) {
            for (int m = 0; m < 60; ++m) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    ans.add(h + ":" + (m < 10 ? "0" : "") + m);
                }
            }
        }
        return ans;
    }

}
