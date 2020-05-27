package answer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode230 {

    public int kthSmallest(TreeNode root, int k) {

        Stack<TreeNode> stack=new Stack<>();
        while (!stack.isEmpty() || root!=null){
            if (root!=null){
                stack.push(root);
                root=root.left;
            }else {
                root=stack.pop();
                if (--k==0){
                    return root.val;
                }
                root=root.right;
            }
        }
        return k;
    }

}
