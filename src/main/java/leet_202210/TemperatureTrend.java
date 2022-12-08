package leet_202210;

/**
 * @Author wanys
 * @Date 2022/10/22 01:13
 * @Version 1.0
 **/
public class TemperatureTrend {
    public int temperatureTrend(int[] temperatureA, int[] temperatureB) {
        int n=temperatureA.length;
        //统计连续天数，考虑到使用滑动窗口
        int[] changeA=new int[n-1];
        int[] changeB=new int[n-1];
        for(int i=0;i<n-1;i++){
            changeA[i]=(temperatureA[i+1]-temperatureA[i]>=0?(temperatureA[i+1]-temperatureA[i]==0?0:1):-1);
            changeB[i]=(temperatureB[i+1]-temperatureB[i]>=0?(temperatureB[i+1]-temperatureB[i]==0?0:1):-1);
        }
        int max=0;
        int count=0;
        for(int i=0;i<n-1;i++){
            if(changeA[i]==changeB[i]){
                count++;
            }else{
                count=0;
            }
            max=Math.max(count,max);
        }

        return max;
    }
}
