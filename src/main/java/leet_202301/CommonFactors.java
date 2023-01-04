package leet_202301;

/**
 * 2427. 公因子的数目
 *
 * @Author wanys
 * @Date 2023/1/4 20:48
 * @Version 1.0
 **/
public class CommonFactors {
    public int commonFactors(int a, int b) {
        int end=Math.min(a,b);
        int res=0;
        for(int i=1;i<=end;i++){
            if(a%i==0&&b%i==0){
                res++;
            }
        }
        return res;

    }
}
