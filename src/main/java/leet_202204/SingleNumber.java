package leet_202204;

/**
 * 对于数组中的每一个元素 x，我们使用位运算 (x >> i) & 1 得到 x 的第 i 个二进制位
 *
 * @Author wanys
 * @Date 2022/4/22 5:02 PM
 * @Version 1.0
 **/
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i <32 ; i++) {
            int total=0;
            for(int num:nums){
                total+=((num>>i)&1);

            }
            if(total%3!=0){
                ans |= (1 << i);
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        //求各位二进制数
        System.out.println((10>>1)&1);//1
        System.out.println((10>>2)&1);//0
        System.out.println((10>>3)&1);//1
        System.out.println((10>>4)&1);//0
        System.out.println("====");
        System.out.println(5&1);
        System.out.println(4&1);
        System.out.println(6&1);
        System.out.println("-----");
        System.out.println(5&0);
        System.out.println(4&0);
        System.out.println(6&0);
        System.out.println("-----");
        System.out.println((10>>1));
        System.out.println((10>>2));
        System.out.println((10>>3));
        System.out.println((10>>4));


    }
}
