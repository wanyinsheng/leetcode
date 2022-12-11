package leet_202205;

/**
 * @Author wanys
 * @Date 2022/5/20 4:19 PM
 * @Version 1.0
 **/
public class ThirdMax {

    /**
     * 使用a,b,c分别表示最大值，第二大值，第三大值
     * @param nums
     * @return
     */
    public int thirdMax(int[] nums) {
        long a=Long.MIN_VALUE,b=Long.MIN_VALUE,c=Long.MIN_VALUE;
        for (long num:nums) {
            if(num>a){//大于最大值
                //每个都往上升一级
                c=b;
                b=a;
                a=num;
            }else if(a > num && num > b){//第一大与第二大之间
                c = b;
                b = num;
            }else if(b > num && num > c) {//第二大与第三大之间
                c = num;
            }else {

            }
        }
        return c == Long.MIN_VALUE ? (int) a : (int) c;


    }
}
