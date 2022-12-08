package leet_202205;

/**
 * @Author wanys
 * @Date 2022/5/20 2:44 PM
 * @Version 1.0
 **/
public class MonotoneIncreasingDigits {
    public int monotoneIncreasingDigits(int n) {
        char[] strN = Integer.toString(n).toCharArray();
        int i = 1;
        //  从左往右找，需要都是递增的
        while (i < strN.length && strN[i - 1] <= strN[i]) {
            i += 1;
        }
        //如果此时i还没到末尾，说明，后边不递增 了，前边的高位需要减一了，减一需要一直向左寻找合适的那位，如122221，需要找到最左边的2

        if(i<strN.length){
            while(i>0&&strN[i - 1] > strN[i]){
                strN[i - 1] -= 1;
                i -= 1;
            }
            //后边几位都填充9
            for (i += 1; i < strN.length; ++i) {
                strN[i] = '9';
            }


        }
        return Integer.parseInt(new String(strN));


    }
}
