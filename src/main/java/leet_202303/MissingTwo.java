package leet_202303;

/**
 * 面试题 17.19. 消失的两个数字
 * @Author wanys
 * @Date 2023/3/7 11:13
 * @Version 1.0
 **/
public class MissingTwo {
    /**
     * 异或
     * @param nums
     * @return
     */
    public int[] missingTwo(int[] nums) {
        int xorsum = 0;
        int n = nums.length + 2;
        //对数组本身进行异或
        for (int num : nums) {
            xorsum ^= num;
        }
        //接着对[1,n]异或
        for (int i = 1; i <= n; i++) {
            xorsum ^= i;
        }
        // 防止溢出
       //因此，我们可以使用位运算 x & -x 取出 的二进制表示中最低位那个1
        int lsb = (xorsum == Integer.MIN_VALUE ? xorsum : xorsum & (-xorsum));
        int type1 = 0, type2 = 0;
        //分成两类，一类l位异或结果为1的，另一类l位异或结果为0的
        for (int num : nums) {
            if ((num & lsb) != 0) {
                type1 ^= num;
            } else {
                type2 ^= num;
            }
        }

        for (int i = 1; i <= n; i++) {
            if ((i & lsb) != 0) {
                type1 ^= i;
            } else {
                type2 ^= i;
            }
        }
        return new int[]{type1, type2};


    }
}
