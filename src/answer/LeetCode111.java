package answer;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode111 {
    public static void main(String[] args) {
        new LeetCode111().minDepth(TreeNode.getTreeNode(new int[]{1,2,3,4,5}));
    }
    public int minDepth(TreeNode root) {
        int res=0;
        if (root==null) return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            res++;
            for (int i = 0; i < size; i++) {
                root=queue.poll();
                if (root.left==null&&root.right==null){
                    return res;
                }
                if (root.left!=null) queue.offer(root.left);
                if (root.right!=null) queue.offer(root.right);
            }
        }
        return res;

    }
}
