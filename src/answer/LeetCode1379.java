package answer;

public class LeetCode1379 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {



    }
    private final TreeNode search(TreeNode cloned,TreeNode target){
        if (cloned.val==target.val || cloned==null){
            return cloned;
        }
        TreeNode t=search(cloned.left,target)
        if (t==null){
            search(cloned.right,target);
        };


    }
}
