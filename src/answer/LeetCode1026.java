package answer;

import java.util.ArrayList;
import java.util.List;
//暴力解，非最优解法
public class LeetCode1026 {
    int res;
    public int maxAncestorDiff(TreeNode root) {
        res=0;
        if (root==null) return res;
        helper(root,new ArrayList<>());
        return res;
    }
    private void helper(TreeNode root, List<Integer> list){
        for (Integer integer : list) {
            res= Math.max(Math.abs(integer-root.val),res);
        }
        list.add(root.val);
        if (root.left!=null){
            helper(root.left,list);
            list.remove(list.size()-1);
        }
        if (root.right!=null){
            helper(root.right,list);
            list.remove(list.size()-1);
        }
    }
}
