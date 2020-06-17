package answer;

public class LeetCode998 {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if (root==null || val>root.val){
            TreeNode treeNode=new TreeNode(val);
            treeNode.left=root;
            return treeNode;
        }
        helper(root,root.right,val);
        return root;
    }
    private void helper(TreeNode father,TreeNode root,int val){
        if (root==null||root.val<val){
            TreeNode treeNode = new TreeNode(val);
            treeNode.left=root;
            father.right=treeNode;
            return;
        }
        helper(root,root.right,val);
    }
}
