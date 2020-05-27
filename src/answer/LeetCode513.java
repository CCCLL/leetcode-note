package answer;

public class LeetCode513 {
    int res;
    int maxLevel;
    public int findBottomLeftValue(TreeNode root) {
        res=0;
        maxLevel=0;
        dt(root,0);
        return res;

    }
    private void dt(TreeNode root,int level){
        if (root==null) return;
        if (++level>=maxLevel){
            maxLevel=level;
            res=root.val;
        }
        dt(root.right,level);
        dt(root.left,level);

    }
}
