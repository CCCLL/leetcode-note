package answer;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode1302 {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int sum=0;
        int size=0;
        while (!queue.isEmpty()){
            sum=0;
            size=queue.size();
            while (size-- > 0){
                TreeNode node=queue.poll();
                sum+=node.val;
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
        }
        return sum;
    }
}
