package answer;

import java.util.*;

public class LeetCode1305 {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> stack=new Stack<>();
        Queue<Integer> t1=new LinkedList<>();
        while (!stack.isEmpty() || root1!=null){
            if (root1!=null){
                stack.push(root1);
                root1=root1.left;
            }else {
                TreeNode tmp=stack.pop();
                t1.offer(tmp.val);
                root1=tmp.right;
            }
        }

        Queue<Integer> t2=new LinkedList<>();
        while (!stack.isEmpty() || root2!=null){
            if (root2!=null){
                stack.push(root2);
                root2=root2.left;
            }else {
                TreeNode tmp=stack.pop();
                t2.offer(tmp.val);
                root2=tmp.right;
            }
        }

        List<Integer> res=new ArrayList<>();
        while (!t1.isEmpty() && !t2.isEmpty()){
            if (t1.peek() <= t2.peek()){
                res.add(t1.poll());
            }else {
                res.add(t2.poll());
            }
        }
        t1=t1.isEmpty()? t2:t1;
        res.addAll(t1);
        return res;

    }
}
