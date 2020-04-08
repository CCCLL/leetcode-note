package answer;

public class LeetCode226 {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;


    }
    private void invert(TreeNode node){
        if (node==null){
            return;
        }
        TreeNode node1=node.left;
        node.left=node.right;
        node.right=node1;
        invert(node.left);
        invert(node.right);
    }
}
