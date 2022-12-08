package leet_202209;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author wanys
 * @Date 2022/9/13 20:35
 * @Version 1.0
 **/
public class CopyRandomList {
    Map<Node, Node> cachedNode = new HashMap<Node, Node>();
    public Node copyRandomList(Node head) {

        if(head==null){
            return  null;
        }
        if (!cachedNode.containsKey(head)) {
            Node headNew = new Node(head.val);
            cachedNode.put(head, headNew);
            headNew.next = copyRandomList(head.next);
            headNew.random = copyRandomList(head.random);

        }

        return cachedNode.get(head);
    }
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
