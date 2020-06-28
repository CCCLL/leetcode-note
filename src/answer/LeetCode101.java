package answer;

public class LeetCode101 {
    public static void main(String[] args) {
        new LeetCode101().isSymmetric(TreeNode.getTreeNode(new int[]{1,2,2,3,4,4,3}));
    }
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        return helper(root.left,root.right);
    }
    private boolean helper(TreeNode treeNode1,TreeNode treeNode2){
        if (treeNode1==null && treeNode2==null) return true;
        if (treeNode1==null || treeNode2==null) return false;
        boolean left = helper(treeNode1.left, treeNode2.right);
        boolean right = helper(treeNode1.right, treeNode2.left);
        return treeNode1.val==treeNode2.val&&left&&right;
    }
}
