package leet_202205;

/**
 * 2011. 执行操作后的变量值
 * @Author wanys
 * @Date 2022/5/20 9:02 PM
 * @Version 1.0
 **/
public class FinalValueAfterOperations {
    public int finalValueAfterOperations(String[] operations) {
        int sum=0;
        for(String op:operations){
            if(op.charAt(1)=='+')
                sum+=1;
            else
                sum-=1;
        }
        return sum;
    }

}
