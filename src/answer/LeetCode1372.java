package answer;

public class LeetCode1372 {
    int res;
    public int longestZigZag(TreeNode root) {
        res=0;
        bl(root);
        return res;
    }
    private void bl(TreeNode root){
        if (root==null) return;
        helper(root,true,0);
        helper(root,false,0);
        bl(root.left);
        bl(root.right);
    }
    private void helper(TreeNode root,boolean flag,int len){
        if (flag){
            if (root.left!=null){
                len++;
                res= Math.max(res,len);
                helper(root.left,!flag,len);
            }
        }else {
            if (root.right!=null){
                len++;
                res= Math.max(res,len);
                helper(root.right,!flag,len);
            }
        }
    }
}
