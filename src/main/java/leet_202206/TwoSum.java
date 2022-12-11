package leet_202206;

/**
 * @Author wanys
 * @Date 2022/6/6 10:19 PM
 * @Version 1.0
 **/
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; ++i) {
            //寻找第二个数的时候使用二分查找
            int low = i + 1, high = numbers.length - 1;
            while(low<=high){
                int mid=(high-low)/2+low;
                if(numbers[mid]==target-numbers[i]){
                    return new int[]{i,mid};
                }else if(numbers[mid]<target-numbers[i]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
