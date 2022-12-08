package leet_202206;

/**
 * 134. 加油站
 *
 * @Author wanys
 * @Date 2022/6/30 2:33 PM
 * @Version 1.0
 **/
public class CanCompleteCircuit {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int i=0;
        while(i<n){
            int sumGas=0;
            int sumCost=0;
            int cnt=0;
            while(cnt<n){
                int j=(i+cnt)%n;
                sumGas+=gas[j];
                sumCost+=cost[j];
                if(sumCost>sumGas)
                    break;
                cnt++;
            }
            if(cnt==n){
                return i;
            }else{
                i=i+cnt+1;
            }

        }
        return -1;
    }
}
