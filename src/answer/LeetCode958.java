package answer;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode958 {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            root=queue.poll();
            if (root==null){
                while (!queue.isEmpty()){
                    root=queue.poll();
                    if (root!=null){
                        return false;
                    }
                }
                return true;
            }else {
                queue.offer(root.left);
                queue.offer(root.right);
            }
        }
        return true;
    }
}
