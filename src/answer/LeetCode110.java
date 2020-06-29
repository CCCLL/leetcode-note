package answer;

public class LeetCode110 {
    boolean res;
    public boolean isBalanced(TreeNode root) {
        res=true;
        helper(root);
        return res;
    }
    private int helper(TreeNode root){
        if (root==null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        if (Math.abs(left-right)>1){
            res=false;
        }
        return Math.max(left,right)+1;
    }
}
