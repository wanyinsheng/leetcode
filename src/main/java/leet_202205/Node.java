package leet_202205;

import java.util.List;

/**
 * @Author wanys
 * @Date 2022/5/21 2:39 PM
 * @Version 1.0
 **/
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
