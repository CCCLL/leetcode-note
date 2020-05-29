package answer;

import java.util.Stack;

public class LeetCode114 {
    public void flatten(TreeNode root) {
        if (root==null) return;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode father=null;
        stack.push(root);
        while (!stack.isEmpty()){
            root=stack.pop();
            if (root.right!=null){
                stack.push(root.right);
            }
            if (root.left!=null){
                stack.push(root.left);
            }

            if (father!=null){
                father.left=null;
                father.right=root;
            }
            father=root;

        }

    }
}
