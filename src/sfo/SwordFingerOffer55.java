package sfo;

import answer.TreeNode;

public class SwordFingerOffer55 {

    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        return deoth(root,1);
    }
    private int deoth(TreeNode node,int level){
        int liftMax=level;
        int rightMax=level;
        if (node.left!=null){
            liftMax=deoth(node.left,level+1);
        }
        if (node.right!=null){
            rightMax=deoth(node.right,level+1);
        }
        return Math.max(liftMax,rightMax);

    }
}
