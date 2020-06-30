package answer;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode117 {
    public Node connect(Node root) {
        if (root==null) return null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node pre = null;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                if (pre == null) {
                    pre = queue.poll();
                } else {
                    pre.next = queue.poll();
                    pre=pre.next;
                }
                if (pre.left!=null) queue.offer(pre.left);
                if (pre.right!=null) queue.offer(pre.right);
            }
        }
        return root;

    }
}
