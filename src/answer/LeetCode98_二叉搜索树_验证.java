package answer;

import java.util.ArrayList;
import java.util.List;

public class LeetCode98_二叉搜索树_验证 {
    public boolean isValidBST(TreeNode root) {
        if (root==null) return true;
        List<Integer> list=new ArrayList<>();
        helper(root,list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1)>=list.get(i)){
                return false;
            }
        }
        return true;



    }
    private void helper(TreeNode root,List<Integer> list){
        if (root==null) return;
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
    }
}
