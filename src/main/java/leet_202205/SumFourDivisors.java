package leet_202205;

/**
 * @Author wanys
 * @Date 2022/5/21 8:20 AM
 * @Version 1.0
 **/
public class SumFourDivisors {

    boolean flag = false;//是否为四个因子
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = getFactorSum(nums[i]);
            System.out.println(x+" "+flag);
            if (flag) {
                ans += x;
                flag = false;
            }
        }
        return ans;

    }

    public int getFactorSum(int num) {
        //如果是6*6=36,那么肯定是奇数个因子
        if(num % Math.sqrt(num) == 0){
            flag = false;
            return 0;
        }
        int sum = 0;
        int count = 0;
        int end = (int) Math.sqrt(num);//取下整
        for (int i = 1; i <=end; i++) {
            if (num % i == 0) {
                count += 1;
                sum += (i + (num / i));


            }
        }
        if (count == 2) {
            flag = true;
        }
        return sum;
    }
}
