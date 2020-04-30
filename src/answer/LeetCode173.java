package answer;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode173 {
    class BSTIterator {
        Deque<TreeNode> stack ;

        public BSTIterator(TreeNode root) {
            stack=new ArrayDeque<>();
            cr(root);
        }

        private void cr(TreeNode treeNode){
            while (treeNode!=null){
                stack.push(treeNode);
                treeNode=treeNode.left;
            }
        }

        /** @return the next smallest number */
        public int next() {
            TreeNode min=stack.poll();
            cr(min.right);
            return min.val;
        }

        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            return stack.size()!=0;
        }
    }
}
