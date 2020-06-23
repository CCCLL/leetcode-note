package answer;

import java.util.HashMap;
import java.util.Map;


//时间复杂度高
public class LeetCode1457 {
    int res;
    public int pseudoPalindromicPaths (TreeNode root) {
        res=0;
        if (root==null) return res;
        helper(root,new HashMap<>());
        return res;
    }
    private void helper(TreeNode root, Map<Integer,Integer> map){
        if (map.containsKey(root.val)){
            map.put(root.val,map.get(root.val)+1);
        }else {
            map.put(root.val,1);
        }
        if (root.left==null&&root.right==null){
            int count=0;
            for (Integer key : map.keySet()) {
                if (map.get(key)%2!=0){
                    count++;
                }
            }
            if (count<2){
                res++;
            }
        }
        if (root.left!=null){
            helper(root.left,map);
            map.put(root.left.val,map.get(root.left.val)-1);
        }
        if (root.right!=null){
            helper(root.right,map);
            map.put(root.right.val,map.get(root.right.val)-1);
        }

    }
}
