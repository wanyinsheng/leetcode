package leet_202204;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author wanys
 * @Date 2022/4/8 4:08 PM
 * @Version 1.0
 **/
public class RightSideView {

    public List<Integer> rightSideView(TreeNode root) {

        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        List<Integer> res=new ArrayList<Integer>();
        if(root==null)
            return res;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i <size ; i++) {
                TreeNode poll = queue.poll();
                //是最右侧节点，加入到list中
                if(i==0){
                    res.add(poll.val);
                }
                if(poll.right!=null){
                    queue.add(poll.right);
                }
                if(poll.left!=null){
                    queue.offer(poll.left);
                }
            }


        }
        return res;
    }
}
