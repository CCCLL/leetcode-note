package answer;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode222 {
    public int countNodes(TreeNode root) {
        int res=0;
        if (root==null) return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            root = queue.poll();
            res++;
            if (root.left!=null){
                queue.offer(root.left);
            }
            if (root.right!=null){
                queue.offer(root.right);
            }

        }
        return res;

    }
}
