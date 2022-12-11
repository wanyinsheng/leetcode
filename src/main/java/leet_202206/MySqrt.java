package leet_202206;

/**
 * 剑指 Offer II 072. 求平方根
 * @Author wanys
 * @Date 2022/6/7 9:06 AM
 * @Version 1.0
 **/
public class MySqrt {

    /**
     * 二分查找
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        int left=0;
        int right=x;
        int ans=-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if((long)mid*mid<=x){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;//最后一次更新的ans
    }
}
