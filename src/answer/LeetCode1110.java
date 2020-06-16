package answer;

import sun.plugin2.util.NativeLibLoader;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LeetCode1110 {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> res=new LinkedList<>();
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < to_delete.length; i++) {
            set.add(to_delete[i]);
        }
        helper(null,root,set,res);
        return res;
    }
    private void helper(TreeNode father, TreeNode root, Set<Integer> hashSet,List<TreeNode> res){
        if (root==null) return;
        if (!hashSet.contains(root.val)){
            if (father== null){
                res.add(root);
            }
            helper(root,root.left,hashSet,res);
            helper(root,root.right,hashSet,res);
        }else {
            helper(null,root.left,hashSet,res);
            helper(null,root.right,hashSet,res);
            if (father!=null){
                if (father.left==root){
                    father.left=null;
                }else {
                    father.right=null;
                }
            }
        }
    }
}
