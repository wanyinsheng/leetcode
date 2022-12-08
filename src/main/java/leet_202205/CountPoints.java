package leet_202205;

/**
 * 1828. 统计一个圆中点的数目
 * @Author wanys
 * @Date 2022/5/21 8:08 PM
 * @Version 1.0
 **/
public class CountPoints {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans=new int[queries.length];
        //遍历每一个查询
        for (int i = 0; i < queries.length; i++) {
            //遍历每一个点
            int count=0;
            for (int j = 0; j <points.length ; j++) {
                if((points[j][0]-queries[i][0])*(points[j][0]-queries[i][0])+(points[j][1]-queries[i][1])*(points[j][1]-queries[i][1])<=queries[i][2]*queries[i][2]){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }

}
