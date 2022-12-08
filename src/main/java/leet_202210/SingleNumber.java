package leet_202210;

/**
 * @Author wanys
 * @Date 2022/10/16 09:29
 * @Version 1.0
 **/
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int[] bitmap = new int[32];
        for (int i = 0; i < nums.length; i++) {
            int bitMask=1;
            for (int j = 31; j >=0 ; j--) {
               int bit=nums[i]&bitMask;
               if(bit!=0 ){
                   bitmap[j]+=1;
               }
               bitMask=bitMask<<1;
            }
        }
        //bitmap取余转成int
        int res=0;
        for (int i = 0; i <32 ; i++) {
            res=res<<1;
            res+=bitmap[i]%3;
        }
        return res;
    }
}
