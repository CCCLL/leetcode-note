package answer;

import java.awt.*;

public class LeetCode572 {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s==null) return false;
        return isSubtree(s.left,t)||isSubtree(s.right,t) || helper(s,t);
    }
    private boolean helper(TreeNode s, TreeNode t){
        if (s==null&&t==null) return true;
        if (s==null||t==null||s.val!=t.val) return false;
        return helper(s.left,t.left)&&helper(s.right,t.right);
    }
}
