package answer;

public class LeetCode1448 {
    public int goodNodes(TreeNode root) {
        return dt(root,Integer.MIN_VALUE);

    }
    private int dt(TreeNode root,int max){
        if (root==null) return 0;
        if (root.val>=max){
            max=root.val;
            return dt(root.left,max)+dt(root.right,max)+1;
        }else {
            return dt(root.left,max)+dt(root.right,max);
        }

    }
}
