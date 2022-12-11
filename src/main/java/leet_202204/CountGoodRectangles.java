package leet_202204;

/**
 * 1725. 可以形成最大正方形的矩形数目
 *
 * @Author wanys
 * @Date 2022/4/1 4:50 PM
 * @Version 1.0
 **/
public class CountGoodRectangles {

    public int countGoodRectangles(int[][] rectangles) {
        int ans = 0;
        int maxLen = 0;//遍历至当前的最大边长，如果有更大的，需要更新，并且重新计数
        for (int i = 0; i < rectangles.length; i++) {
            //边长取长和宽的最小值
            int k = Math.min(rectangles[i][0], rectangles[i][1]);
            if (k == maxLen) {
                ans++;
            } else if (k > maxLen) {//更新最大值
                ans = 1;
                maxLen = k;
            }

        }
        return ans ;
    }
}
