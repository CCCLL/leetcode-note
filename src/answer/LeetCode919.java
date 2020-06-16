package answer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LeetCode919 {
    class CBTInserter {
        TreeNode root;
        List<TreeNode> list;

        public CBTInserter(TreeNode root) {
            this.root=root;
            list=new ArrayList<>();
            Queue<TreeNode> queue= new ArrayDeque<>();
            queue.offer(root);
            while (!queue.isEmpty()){
                int size=queue.size();
                for (int i = 0; i < size; i++) {
                    root=queue.poll();
                    list.add(root);
                    if (root.left!=null) queue.offer(root.left);
                    if (root.right!=null) queue.offer(root.right);
                }
            }

        }

        public int insert(int v) {
            TreeNode treeNode=new TreeNode(v);
            list.add(treeNode);
            TreeNode fatherNode=list.get(list.size() / 2 - 1);
            if (fatherNode.left==null){
                fatherNode.left=treeNode;
            }else {
                fatherNode.right=treeNode;
            }
            return fatherNode.val;
        }

        public TreeNode get_root() {
            return root;

        }
    }
}
