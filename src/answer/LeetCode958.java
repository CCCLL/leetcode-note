package answer;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode958 {
    public boolean isCompleteTree(TreeNode root) {
        int leftHigh=0;
        int rightHigh=0;
        TreeNode h=root;
        while (h!=null){
            leftHigh++;
            h=h.left;
        }
        h=root;
        while (h!=null){
            rightHigh++;
            h=h.right;
        }
        if (leftHigh<rightHigh||leftHigh-rightHigh>1){
            return false;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            root=queue.poll();
            if (root.left==null&&root.right!=null || root.left!=null&&root.right==null&&!queue.isEmpty()){
                return false;
            }
            if (root.left!=null) queue.offer(root.left);
            if (root.right!=null) queue.offer(root.right);
        }
        return true;
    }
}
