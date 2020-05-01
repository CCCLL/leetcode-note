package answer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        List<Integer> res=new ArrayList<>();
        if (root==null){
            return res;
        }
        stack.push(root);
        while (!stack.isEmpty()){
            root=stack.pop();
            res.add(root.val);
            if (root.right!=null){
                stack.push(root.right);
            }
            if (root.left!=null){
                stack.push(root.left);
            }
        }
        return res;
    }
}
