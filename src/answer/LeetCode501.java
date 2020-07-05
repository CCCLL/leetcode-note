package answer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode501 {
    List<Integer> list;
    int max;
    int count;
    TreeNode pre;
    public int[] findMode(TreeNode root) {
        max=0;
        count=0;
        list=new ArrayList<>();
        pre=null;
        helper(root);
        int[] res=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i]=list.get(i);
        }
        return res;
    }
    private void helper(TreeNode root){
        if (root==null) return;
        helper(root.left);
        if (pre!=null&&pre.val==root.val){
            count++;
        }else {
            count=1;
        }
        if (count==max){
            list.add(root.val);
        }else if(count>max) {
            list.clear();
            max=count;
            list.add(root.val);
        }
        pre=root;
        helper(root.right);
    }
}
