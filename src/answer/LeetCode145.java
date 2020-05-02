package answer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        Stack<TreeNode> resStack=new Stack<>();
        List<Integer> res=new ArrayList<>();
        if (root==null){
            return res;
        }
        stack.push(root);
        while (!stack.isEmpty()){
            root=stack.pop();
            resStack.push(root);
            if (root.left!=null){
                stack.push(root.left);
            }
            if (root.right!=null){
                stack.push(root.right);
            }
        }
        int len=resStack.size();
        for (int i = 0; i < len; i++) {
            root=resStack.pop();
            res.add(root.val);
        }
        return res;
    }
}
