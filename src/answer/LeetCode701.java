package answer;

public class LeetCode701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root==null) return new TreeNode(val);
        TreeNode tmp=root;
        while (true){
            if (tmp.val>val){
                if (tmp.left==null){
                    tmp.left=new TreeNode(val);
                    break;
                }
                tmp=tmp.left;
            }else {
                if (tmp.right==null){
                    tmp.right=new TreeNode(val);
                    break;
                }
                tmp=tmp.right;
            }
        }
        return root;

    }
}
