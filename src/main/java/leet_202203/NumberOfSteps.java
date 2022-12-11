package leet_202203;

/**
 * @Author wanys
 * @Date 2022/3/29 9:34 PM
 * @Version 1.0
 **/
public class NumberOfSteps {

    public int numberOfSteps(int num) {
        int result=0;
        while(num>0){
            if(num%2==0){
                num/=2;
            }else {
                num-=1;
            }
            result++;
        }
        return  result;
    }
}
