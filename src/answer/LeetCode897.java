package answer;

import java.util.Stack;

public class LeetCode897 {
    public TreeNode increasingBST(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        TreeNode father=null;
        TreeNode res=null;
        while (!stack.isEmpty() || root!=null){
             if (root==null){
                 root=stack.pop();
                 if (father!=null){
                     father.left=null;
                     father.right=root;
                     father=root;
                 }else {
                     father=root;
                     res=father;
                 }
                 root=root.right;
             }else {
                 stack.push(root);
                 root=root.left;
             }
        }
        return res;

    }
}
