package answer;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode1379 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original==null || (original.val==target.val&&cloned.val==target.val)){
            return cloned;
        }
        TreeNode leftTreeNode = getTargetCopy(original.left, cloned.left, target);
        TreeNode rightTreeNode = getTargetCopy(original.right, cloned.right, target);
        return leftTreeNode!=null ? leftTreeNode:rightTreeNode;
    }
    public final TreeNode getTargetCopy1(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(original);
        queue.offer(cloned);
        while (!queue.isEmpty()){
            TreeNode  originalTreeNodequeue = queue.poll();
            TreeNode  clonedTreeNodequeue = queue.poll();
            if (originalTreeNodequeue.val==target.val&&clonedTreeNodequeue.val==target.val){
                return clonedTreeNodequeue;
            }
            if (originalTreeNodequeue.left!=null){
                queue.offer(originalTreeNodequeue.left);
                queue.offer(clonedTreeNodequeue.left);
            }
            if (originalTreeNodequeue.right!=null){
                queue.offer(originalTreeNodequeue.right);
                queue.offer(clonedTreeNodequeue.right);
            }

        }
        return null;
    }


}
