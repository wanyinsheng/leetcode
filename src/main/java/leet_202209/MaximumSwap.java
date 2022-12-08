package leet_202209;

/**
 * @Author wanys
 * @Date 2022/9/13 22:27
 * @Version 1.0
 **/
public class MaximumSwap {
    public int maximumSwap(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        int n=chars.length;
        int maxIdx=n-1;
        //int minId=0;
        int idx1 = -1, idx2 = -1;
        for(int i=n-1;i>=0;i--){
            //从右边开始找最大值
            if(chars[i]>chars[maxIdx]){
                //更新最大值下标
                maxIdx = i;
            }else if(chars[i]<chars[maxIdx]){
                //找到高位最小的一个数字下标idx1，只要小就需要不断更新，一定是较高位的
                idx1 = i;
                idx2 = maxIdx;
            }
        }
        //如果找到了一个较小的数，就交换
        if (idx1 >= 0) {
            swap(chars, idx1, idx2);
            return Integer.parseInt(new String(chars));
        } else {
            return num;
        }

    }
    public void swap(char[] chs,int i,int j){
        char temp=chs[i];
        chs[i]=chs[j];
        chs[j]=temp;
    }
}
