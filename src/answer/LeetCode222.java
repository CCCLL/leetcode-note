package answer;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode222 {
    public int countNodes(TreeNode root) {
        int res=0;
        if (root==null) return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            root = queue.poll();
            res++;
            if (root.left!=null){
                queue.offer(root.left);
            }
            if (root.right!=null){
                queue.offer(root.right);
            }

        }
        return res;

    }
}
/*
1.  left == right。这说明，左子树一定是满二叉树，因为节点已经填充到右子树了，左子树必定已经填满了。
    所以左子树的节点总数我们可以直接得到，是 2^left - 1，加上当前这个 root 节点，则正好是 2^left。再对右子树进行递归统计。
2.  left != right。说明此时最后一层不满，但倒数第二层已经满了，可以直接得到右子树的节点个数。
    同理，右子树节点 +root 节点，总数为 2^right。再对左子树进行递归查找。


class Solution {
    public int countNodes(TreeNode root) {
        if(root == null){
           return 0;
        }
        int left = countLevel(root.left);
        int right = countLevel(root.right);
        if(left == right){
            return countNodes(root.right) + (1<<left);
        }else{
            return countNodes(root.left) + (1<<right);
        }
    }
    //只测左子树层数
    private int countLevel(TreeNode root){
        int level = 0;
        while(root != null){
            level++;
            root = root.left;
        }
        return level;
    }
}

 */
