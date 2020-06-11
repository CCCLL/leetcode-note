package answer;

public class LeetCode129 {
    public int sumNumbers(TreeNode root) {
        if (root==null) return 0;
        return helper(root,0);
    }
    private int helper(TreeNode root,int num){
        num=num*10+root.val;
        if (root.left==null&&root.right==null){
            return num;
        }
        int left=0;
        int right=0;
        if (root.left!=null){
            left=helper(root.left,num);
        }
        if (root.right!=null){
            right=helper(root.right,num);
        }
        return left+right;
    }
}
