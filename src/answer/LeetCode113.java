package answer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode113 {
    List<List<Integer>> res;
    List<Integer> list;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        res = new LinkedList<>();
        if (root == null) return res;
        list = new ArrayList<>();
        helper(root, sum);
        return res;
    }

    private void helper(TreeNode root, int sum) {
        if (root==null) return;
        list.add(root.val);
        sum -= root.val;
        if (root.left == null && root.right == null && sum == 0) {
            res.add(new ArrayList<>(list));
        }
        helper(root.left, sum);
        helper(root.right, sum);
        list.remove(list.size() - 1);
    }
}
