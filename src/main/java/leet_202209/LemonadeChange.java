package leet_202209;

/**
 * @Author wanys
 * @Date 2022/9/14 00:22
 * @Version 1.0
 **/
public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        //贪心算法
        //初始化两种面值的张数
        int five=0;
        int ten=0;
        for (int i = 0; i <bills.length ; i++) {
            if(bills[i]==5){
                five++;
            }else if(bills[i]==10){
                if(five==0 ){
                    return false;
                }
                five--;
                ten++;
            }else{//20元
                //优先10+5的面值
                if(five>0&&ten>0){
                    five--;
                    ten--;
                }else if(five>=3){
                    five-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
