package leet_202207;

/**
 * 2259. 移除指定数字得到的最大结果
 * @Author wanys
 * @Date 2022/7/2 10:19 上午
 * @Version 1.0
 **/
public class RemoveDigit {

    /**
     * 贪心算法
     * @param number
     * @param digit
     * @return
     */
    public String removeDigit(String number, char digit) {
        int n=number.length();
        int last=-1;//最后一个可删除的下标
        for (int i = 0; i <n ; i++) {
            if(number.charAt(i)==digit){
                last=i;//可能要删除，下边需要继续判断(last会保存最后一个字符的位置)
                if(i<n-1&&number.charAt(i)<number.charAt(i+1)){
                    return number.substring(0,i)+number.substring(i+1,n-i);//删除第i个
                }
            }
        }//end for
        return number.substring(0,last)+number.substring(last+1);
    }
}
