package leet_202301;

/**
 * 1304. 和为零的 N 个不同整数
 *
 * @Author wanys
 * @Date 2023/1/5 15:09
 * @Version 1.0
 **/
public class SumZero {
    public int[] sumZero(int n) {
        if(n==1){
            return new int[]{0};
        }
        int[] ans = new int[n];
        //sum为前n-1项的和
        int sum=0;
        for (int i = 1; i <n ; i++) {
            ans[i-1]=i;
            sum+=i;
        }
        ans[n-1]=-sum;
        return ans;
    }
}
