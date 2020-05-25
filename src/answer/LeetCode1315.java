package answer;

import java.util.LinkedList;
import java.util.Queue;

//错误答案
public class LeetCode1315 {
    public int sumEvenGrandparent(TreeNode root) {
        int sum=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode treeNode=queue.poll();
            if(treeNode.left!=null){
                if(treeNode.val<0){
                    sum+=treeNode.left.val;
                }
                if(Math.abs(treeNode.val)%2==0){
                    treeNode.left.val=-treeNode.left.val;
                }
                queue.offer(treeNode.left);
            }
            if(treeNode.right!=null){
                if(treeNode.val<0){
                    sum+=treeNode.right.val;
                }
                if(Math.abs(treeNode.val)%2==0){
                    treeNode.right.val=-treeNode.right.val;
                }
                queue.offer(treeNode.right);
            }

        }
        return sum;

    }

}
