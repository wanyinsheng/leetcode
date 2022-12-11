package leet_202203;

/**
 * @Author wanys
 * @Date 2022/3/29 8:40 PM
 * @Version 1.0
 **/
public class Construct2DArray {
    public int[][] construct2DArray(int[] original, int m, int n) {

        if(original.length!=m*n)
            return new int[0][];//返回一个空数组
        int[][] ans=new int[m][n];
        int j=0;//列
        for (int i = 0;i <original.length ; i++) {
            ans[i/n][j++]=original[i];
            if(j%n==0)
                j=0;
        }
        return  ans;
    }
}
