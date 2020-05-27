package answer;

public class LeetCode1325 {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return dt(root, target);

    }
    private TreeNode dt(TreeNode root, int target){
        if (root==null || (root.left==null&&root.right==null&&root.val==target)){
            return null;
        }
        root.left=dt(root.left,target);

        root.right=dt(root.right,target);
        if (root.left==null&&root.right==null&&root.val==target){
            return null;
        }
        return root;
    }
}
