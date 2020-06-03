package answer;

public class LeetCode783 {
    Integer pre,min;
    public int minDiffInBST(TreeNode root) {
        pre=null;
        min=Integer.MAX_VALUE;
        bt(root);
        return min;

    }
    private void bt(TreeNode root){
        if (root==null) return;
        bt(root.left);
        if (pre!=null){
            min=Math.min(min,root.val-pre);
        }
        pre=root.val;
        bt(root.right);

    }
}
