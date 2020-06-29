package answer;

public class LeetCode543 {
    int res;
    public int diameterOfBinaryTree(TreeNode root) {
        res=0;
        helper(root);
        return res;
    }
    private int helper(TreeNode root){
        if (root==null) return 0;
        int left=helper(root.left);
        int right=helper(root.right);
        res=Math.max(res,left+right);
        return Math.max(left,right)+1;
    }
}
