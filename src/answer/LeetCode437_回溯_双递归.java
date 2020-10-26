package answer;

import java.util.ArrayList;
import java.util.List;

public class LeetCode437_回溯_双递归 {
    int res=0;
    public int pathSum(TreeNode root, int sum) {
        helper(root,sum,new ArrayList<>());
        return res;
    }
    private void helper(TreeNode root, int sum, List<Integer> list){
        if (root==null) return;
        for (int i = 0; i < list.size(); i++) {
            int tmp=list.get(i)+root.val;
            list.set(i,tmp);
            if (tmp==sum){
                res++;
            }
        }
        if (root.val==sum){
            res++;
        }
        list.add(root.val);
        helper(root.left,sum,list);
        helper(root.right,sum,list);
        list.remove(list.size()-1);
        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)-root.val);
        }

    }

    /*
     * 另一种思路，分别计算包含当前节点路径和不包含当前节点路径，然后想加即可得出结果，此算法效率较好

    public int pathSum(TreeNode root, int sum) {
        if (root==null) return 0;
        //计算包含当前节点的路径
        int res=helper(root,sum);
        //下面这两行代码是计算不包含当前节点的路径
        res+=pathSum(root.left,sum);
        res+=pathSum(root.right,sum);
        return res;
    }
    private int helper(TreeNode root, int sum){

        if (root==null) return 0;
        int res=0;
        if (root.val==sum){
            res++;
        }
        res+=helper(root.left,sum-root.val);
        res+=helper(root.right,sum-root.val);
        return res;
    }

     */
}
