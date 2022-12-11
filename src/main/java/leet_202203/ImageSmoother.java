package leet_202203;

/**
 * 661. 图片平滑器
 *
 * @Author wanys
 * @Date 2022/3/29 12:05 AM
 * @Version 1.0
 **/
public class ImageSmoother {

    /**
     * 遍历
     *
     * @param img
     * @return
     */
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int num = 0;
                int sum = 0;
                for (int x = i-1; x <=i+1 ; x++) {
                    for (int y = j-1; y <=j+1 ; y++) {
                        //判断位置是否合理
                        if(x >= 0 && x < m && y >= 0 && y < n){
                            num++;
                            sum+=img[x][y];
                        }
                    }
                }
                //求和结束
                result[i][j]=sum/num;

            }

        }
        return result;
    }

}

