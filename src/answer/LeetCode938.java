package answer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LeetCode938 {
    public static void main(String[] args) {

    }
    public int rangeSumBST(TreeNode root, int L, int R) {
        Stack<TreeNode> stack=new Stack<>();
        int res=0;
        TreeNode treeNode;
        stack.push(root);
        while (!stack.empty()){
            treeNode=stack.pop();
            if (treeNode!=null){
                if (treeNode.val>=L && treeNode.val<=R){
                    res+=treeNode.val;
                }
                if (treeNode.val>L){
                    stack.push(treeNode.left);
                }
                if (treeNode.val<R){
                    stack.push(treeNode.right);
                }
            }
        }
        return res;
    }
//    public int rangeSumBST(TreeNode root, int L, int R) {
//        Queue<TreeNode> queue=new LinkedList<>();
//        int res=0;
//        TreeNode treeNode;
//        queue.add(root);
//        while (!queue.isEmpty()){
//            treeNode=queue.poll();
//            if (treeNode.val>=L && treeNode.val<=R){
//                res+=treeNode.val;
//            }
//            if (treeNode.left!=null){
//                queue.add(treeNode.left);
//            }
//            if (treeNode.right!=null){
//                queue.add(treeNode.right);
//            }
//        }
//        return res;
//
//    }

}
