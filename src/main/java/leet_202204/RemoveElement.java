package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/24 1:57 PM
 * @Version 1.0
 **/
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int newIndex=0;
        for (int i = 0; i <n ; i++) {
            if(nums[i]==val){
                nums[newIndex++]=nums[i];
            }

            
        }
        return newIndex;//因为上边赋值完已经加一操作了
    }
}
