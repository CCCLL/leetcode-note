package answer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        List<Integer> res= new ArrayList<>();
        while (!stack.isEmpty() || root!=null){
            if(root!=null){
                stack.push(root);
                root=root.left;
            }else {
                TreeNode treeNode = stack.pop();
                root=treeNode.right;
                res.add(treeNode.val);
            }
        }
        return res;
    }
}
