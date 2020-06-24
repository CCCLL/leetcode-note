package answer;

public class LeetCode623 {
    TreeNode res;
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        res=root;
        helper(null,root,v,d,true);
        return res;
    }
    private void helper(TreeNode father,TreeNode root,int v,int d,boolean flag){
        if (d==1){
            TreeNode treeNode=new TreeNode(v);
            if (father==null){
                res=treeNode;
                res.left=root;
            }else {
                if (flag){
                    father.left=treeNode;
                    treeNode.left=root;
                }else {
                    father.right=treeNode;
                    treeNode.right=root;
                }
            }
        }else {
            if (root!=null){
                helper(root,root.left,v,d-1,true);
                helper(root,root.right,v,d-1,false);
            }
        }
    }
}
