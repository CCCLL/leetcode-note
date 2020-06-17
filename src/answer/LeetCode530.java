package answer;

import java.util.ArrayList;
import java.util.List;

public class LeetCode530 {
    int min;
    Integer pre;
    public int getMinimumDifference(TreeNode root) {
        min=Integer.MAX_VALUE;
        helper(root);
        return min;
    }
    private void helper(TreeNode root){
        if (root==null) return;
        helper(root.left);
        if (pre!=null){
            min=Math.min(min,Math.abs(root.val-pre));
        }
        pre=root.val;
        helper(root.right);
    }
}
