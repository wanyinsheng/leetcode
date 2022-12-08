package leet_202210;


/**
 * @Author wanys
 * @Date 2022/10/17 15:43
 * @Version 1.0
 **/
public class TreeToDoublyList {
    Node pre, head;

    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    void dfs(Node cur) {
        if (cur == null) return;
        dfs(cur.left);
        //当前接节点处理
        if (pre != null) pre.right = cur;
        else head = cur;
        cur.left = pre;
        pre = cur;//修改pre节点为当前节点

        dfs(cur.right);
    }
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }


}
