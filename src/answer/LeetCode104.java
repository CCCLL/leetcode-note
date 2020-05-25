package answer;

public class LeetCode104 {
    public int maxDepth(TreeNode root) {
        return dt(root, 0);


    }
    private int dt(TreeNode root,int count){
        if (root==null){
            return count;
        }
        int leftCount = dt(root.left, count + 1);
        int rightCount = dt(root.right, count + 1);
        return Math.max(leftCount,rightCount);
    }
}
