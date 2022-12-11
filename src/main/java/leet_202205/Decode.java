package leet_202205;

/**
 * @Author wanys
 * @Date 2022/5/21 8:06 PM
 * @Version 1.0
 **/
public class Decode {

    public int[] decode(int[] encoded, int first) {
        int n=encoded.length+1;
        int[] arr=new int[n];
        arr[0]=first;
        for (int i = 1; i <n ; i++) {
            arr[i] = arr[i - 1] ^ encoded[i - 1];
        }
        return arr;
    }

}
