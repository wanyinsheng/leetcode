package leet_202212;

import java.util.Arrays;

public class FindMinArrowShots {
	public int findMinArrowShots(int[][] points) {
		// 根据气球直径的开始坐标从小到大排序
		// 使用Integer内置比较方法，不会溢出
		Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
		int count = 1;  // points 不为空至少需要一支箭
		for (int i = 1; i < points.length; i++) {
			if (points[i][0] > points[i - 1][1]) {  // 气球i和气球i-1不挨着，注意这里不是>=
				count++; // 需要一支箭
			} else {  // 气球i和气球i-1挨着(重叠或者刚好连着)
				points[i][1] = Math.min(points[i][1], points[i - 1][1]); // 更新重叠气球最小右边界
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(Integer.compare(1,2));
	}


}
