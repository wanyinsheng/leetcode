package leet_202205;

/**
 * 1486. 数组异或操作
 * @Author wanys
 * @Date 2022/5/21 1:19 PM
 * @Version 1.0
 **/
public class XOROperation {

    public int xorOperation(int n, int start) {
        int ans=0;
        for (int i = 0; i <n ; i++) {
            ans^=(start+i*2);

        }
        return ans;

    }

}
