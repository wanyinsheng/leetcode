package leet_202304;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 116. 填充每个节点的下一个右侧节点指针
 *
 * @Author wanys
 * @Date 2023/4/24 15:34
 * @Version 1.0
 **/
public class Connect {
    /**
     * 层次遍历
     */
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        // 初始化队列同时将第一层节点加入队列中，即根节点
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        // 外层的 while 循环迭代的是层数
        while (!queue.isEmpty()) {
            // 记录当前队列大小
            int size = queue.size();
            // 遍历这一层的所有节点
            for (int i = 0; i < size; i++) {
                // 每次从队列中拿出来遍历的元素都是属于同一层的
                // 从队首取出元素
                Node node = queue.poll();
                // 连接
                if (i < size - 1) {
                    //当前节点出队列了，下一个节点就是右侧节点，最后一个节点没有右节点
                    node.next = queue.peek();
                }

                // 拓展下一层节点
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return root;
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
