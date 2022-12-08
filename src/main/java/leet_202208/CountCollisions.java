package leet_202208;

/**
 * @Author wanys
 * @Date 2022/8/1 10:16
 * @Version 1.0
 **/
public class CountCollisions {
    public int countCollisions(String directions) {
        int n = directions.length();
        int left = 0;
        int right = n - 1;
        int res = 0;
        //考虑左右两边
        while (left <= right && directions.charAt(left) == 'L') left++;
        while (left <= right && directions.charAt(right) == 'R') right--;

        for (int i = left; i <=right; i++) {

            if (directions.charAt(i) == 'L' || directions.charAt(i) == 'R')
                res++;
        }
        return res;
    }
}
