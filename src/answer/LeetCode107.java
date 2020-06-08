package answer;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode107 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new LinkedList<>();
        tb(root,0,res);
        return res;
    }
    private void tb(TreeNode root,int level, List<List<Integer>> res){
        if (root==null) return;
        if (res.size()<=level){
            res.add(0,new LinkedList<>());
        }
        res.get(res.size()-level-1).add(root.val);
        tb(root.left, level+1, res);
        tb(root.right, level+1, res);
    }
}
