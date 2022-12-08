package leet_202204;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author wanys
 * @Date 2022/4/8 11:02 AM
 * @Version 1.0
 **/
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<List<Integer>> lists = new LinkedList<>();

        if(root==null)
            return lists;
        Queue<TreeNode> queue = new LinkedList<>();
        //根节点先入队列
        queue.offer(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            //获取当前层节点个数
            int size = queue.size();

            for (int i = 0; i <size ; i++) {
                TreeNode poll = queue.poll();
                list.add(poll.val);
                if(poll.left!=null)
                    queue.offer(poll.left);
                if(poll.right!=null)
                    queue.offer(poll.right);

            }
            //一层遍历完之后加入大的集合
            lists.add(list);
        }

        return lists;

    }
}
