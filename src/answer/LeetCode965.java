package answer;

import java.util.ArrayDeque;
import java.util.Queue;

public class LeetCode965 {
    public boolean isUnivalTree(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque();
        int pre=root.val;
        queue.offer(root);
        while (!queue.isEmpty()){
            root=queue.poll();
            if (root.val!=pre) return false;
            if (root.left!=null){
                queue.offer(root.left);
            }
            if (root.right!=null){
                queue.offer(root.right);
            }
        }
        return true;
    }
}
