package leet_202204;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author wanys
 * @Date 2022/4/22 4:39 PM
 * @Version 1.0
 **/
public class ZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        if(root==null)
            return ans;
        //使用双端队列
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        //根节点入队列
        queue.offer(root);
        boolean left2Right=true;//从左到右
        while(!queue.isEmpty()){
            Deque<Integer> deque=new LinkedList<Integer>();
            int size=queue.size();
            for (int i = 0; i <size ; i++) {
                TreeNode poll = queue.poll();
                if(left2Right){
                    deque.offerLast(poll.val);
                }else{
                    deque.offerFirst(poll.val);
                }
                if(poll.left!=null){
                    queue.offer(poll.left);
                }
                if(poll.right!=null){
                    queue.offer(poll.right);

                }

            }
            //一层循环结束，变方向
            ans.add(new LinkedList<>(deque));
            left2Right=!left2Right;//取反

        }

        return ans;
    }
}
