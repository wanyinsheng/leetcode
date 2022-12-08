package leet_202205;

/**
 * 754. 到达终点数字
 * @Author wanys
 * @Date 2022/5/16 1:29 AM
 * @Version 1.0
 **/
public class ReachNumber {
    public int reachNumber(int target) {
        //target是正负都无所谓，先变成正数
        target = Math.abs(target);
        int k=0;
        while(target>0){
            target-=++k;
        }
        return target%2==0?k:k+1+k%2;



    }
}
