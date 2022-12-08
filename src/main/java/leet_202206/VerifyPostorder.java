package leet_202206;

/**
 * 剑指 Offer 33. 二叉搜索树的后序遍历序列
 * @Author wanys
 * @Date 2022/6/2 10:28 AM
 * @Version 1.0
 **/
public class VerifyPostorder {
    //方法1，使用递归
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder,0,postorder.length-1);
    }
    boolean recur(int[] postorder,int left,int right){
        if(left>=right){
            return  true;
        }
        int mid=left;
        while(postorder[mid]<postorder[right]){
            mid++;
        }
        for (int i = mid; i <right ; i++) {
            if(postorder[i]<postorder[right]){
                return false;
            }
        }
        return recur(postorder,left,mid-1)&&recur(postorder,mid,right-1);
    }

}
