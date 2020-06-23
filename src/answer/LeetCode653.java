package answer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LeetCode653 {
    public static void main(String[] args) {
        new LeetCode653().findTarget(TreeNode.getTreeNode(new int[]{5,3,6,2,4,0,7}),9);
    }
    public boolean findTarget(TreeNode root, int k) {
        Deque<TreeNode> stack=new ArrayDeque<>();
        List<Integer> list=new ArrayList<>();
        while (!stack.isEmpty()||root!=null){
            if (root!=null){
                stack.push(root);
                root=root.left;
            }else {
                root=stack.poll();
                list.add(root.val);
                root=root.right;
            }
        }
        int left=0;
        int right=list.size()-1;
        while (left<right){
            if (list.get(left)+list.get(right)==k){
                return true;
            }else if (list.get(left)+list.get(right)>k){
                right--;
            }else if (list.get(left)+list.get(right)<k){
                left++;
            }
        }
        return false;

    }
}
