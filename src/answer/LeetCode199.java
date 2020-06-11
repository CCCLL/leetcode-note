package answer;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new LinkedList<>();
        if (root==null) return res;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                root=queue.poll();
                if (root.left!=null) queue.offer(root.left);
                if (root.right!=null) queue.offer(root.right);
            }
            res.add(root.val);
        }
        return res;
    }

}
