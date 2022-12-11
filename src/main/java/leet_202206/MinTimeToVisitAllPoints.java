package leet_202206;

/**
 * 1266. 访问所有点的最小时间
 *
 * @Author wanys
 * @Date 2022/6/14 10:26 PM
 * @Version 1.0
 **/
public class MinTimeToVisitAllPoints {

    public int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length - 1; i++) {
            res += Math.max(Math.abs(points[i][0] - points[i + 1][0]), Math.abs(points[i][1] - points[i + 1][1]));
        }
        return res;
    }


}
