package answer;

public class LeetCode671 {
    int min;
    long res;
    public int findSecondMinimumValue(TreeNode root) {
        if (root==null) return -1;
        min=root.val;
        res= Long.MAX_VALUE;
        helper(root);
        if (res==Long.MAX_VALUE) return -1;
        return Integer.valueOf(String.valueOf(res));
    }
    private void helper(TreeNode root){
        if (root==null) return;
        if (root.val>min&&root.val<res){
            res=root.val;
        }
        helper(root.left);
        helper(root.right);
    }
}
