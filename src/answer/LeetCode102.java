package answer;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new LinkedList<>();
        if (root==null) return res;
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list=new LinkedList<>();
            for (int i = 0; i < size; i++) {
                root=queue.poll();
                list.add(root.val);
                if (root.left!=null) queue.offer(root.left);
                if (root.right!=null) queue.offer(root.right);
            }
            res.add(list);
        }
        return res;

    }
}
