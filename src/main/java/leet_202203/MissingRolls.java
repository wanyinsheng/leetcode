package leet_202203;

/**
 * @Author wanys
 * @Date 2022/3/28 11:30 PM
 * @Version 1.0
 **/
public class MissingRolls {
    public static void main(String[] args) {

    }

    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int sum = (m + n) * mean;
        int missingSum = sum;
        for (int roll : rolls)
            missingSum -= roll;
        //已经计算出丢失的和
        //不可能出现的情况就返回空数组
        if (missingSum < n || missingSum > 6 * n) {
            return new int[0];
        }
        int[] missing = new int[n];
        //这里是任意返回一个，那，/n向下取整，余数在单独处理
        int quotient = missingSum / n;//商
        int remainder = missingSum % n;//余数
        for (int i = 0; i < n; i++) {
            missing[i] = quotient + (i < remainder ? 1 : 0);//余数个，要分别都加一
        }
        return missing;
    }
}
