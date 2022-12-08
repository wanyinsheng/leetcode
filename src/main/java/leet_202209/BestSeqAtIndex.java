package leet_202209;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2022/9/6 10:13
 * @Version 1.0
 **/
public class BestSeqAtIndex {
    public int bestSeqAtIndex(int[] height, int[] weight) {
        if (height == null || height.length == 0) {
            return 0;
        }
        People[] people = new People[height.length];
        for (int i = 0; i < height.length; i++) {
            people[i] = new People(height[i], weight[i]);
        }
        // 按高度排序
        Arrays.sort(people);
        return longestIncSubSeq(people);
    }
    /**
     * 对体重，二分求最长递增子串
     * @param people
     * @return
     */
    private int longestIncSubSeq(People[] people) {
        int[] top = new int[people.length];
        int piles = 0;
        for (People person : people) {
            int w = person.weight;
            int low = 0;
            int high = piles;
            int mid = 0;
            while (low < high) {
                mid = (low + high) / 2;
                if (top[mid] > w) {
                    high = mid;
                } else if (top[mid] < w) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            if (low == piles) {
                piles++;
            }
            top[low] = w;
        }

        return piles;
    }
}
class People implements Comparable<People> {
    int height;
    int weight;
    int index;

    public void setIndex(int index) {
        this.index = index;
    }

    public People(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(People o) {
        //先根据身高 升序排序，若身高一样则根据体重 降序排序。
        int res = this.height - o.height;
        if (res == 0) {
            return o.weight - this.weight;
        }
        return res;
    }
}
