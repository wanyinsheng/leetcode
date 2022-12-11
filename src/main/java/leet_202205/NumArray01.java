package leet_202205;

/**
 * 307. 区域和检索 - 数组可修改   （线段树的方法实现）
 * @Author wanys
 * @Date 2022/5/12 3:36 PM
 * @Version 1.0
 **/
public class NumArray01 {

    int n;
    int[] a;
    int[] c;
    public NumArray01(int[] nums) {
        n=nums.length;
        a=new int[n+1];
        c=new int[n+1];
        for (int i = 1; i <=n ; i++) {
            a[i]=nums[i-1];
            add(i,a[i]);
        }
        

    }

    public void update(int index, int val) {
        //真实的是从1开始，所以先++
        index++; // 下标从1开始
        int delta = val - a[index];
        add(index, delta);
        a[index] = val;
    }

    public int sumRange(int left, int right) {
        left++; right++; // 下标从1开始
        return query(right) - query(left - 1);
    }
    int query(int x) {
        int ans = 0;
        for (; x > 0; x -= lowbit(x)) ans += c[x];
        return ans;
    }

    void add(int x, int delta) {
        while(x<=n){
            c[x]+=delta;
            x+=lowbit(x);
        }
    }
    int lowbit(int x) {
        return x & (-x);
    }
}
