package answer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LeetCode637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList<>();
        Queue<TreeNode> queue=new ArrayDeque<>();
        double sum=0;
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                root=queue.poll();
                sum+=root.val;
                if (root.left!=null){
                    queue.offer(root.left);
                }
                if (root.right!=null){
                    queue.offer(root.right);
                }
            }
            res.add(sum/size);
            sum=0;
        }
        return res;

    }
}
