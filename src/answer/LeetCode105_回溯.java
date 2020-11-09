package answer;

import java.util.HashMap;
import java.util.Map;

public class LeetCode105_回溯 {
    Map<Integer,Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map=new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return bt(preorder,0,preorder.length-1,0,inorder.length-1);

    }
    private TreeNode bt(int[] preorder, int preLeft, int preRight, int inLeft, int inRight){
        if (preLeft>preRight || inLeft>inRight) return null;
        TreeNode treeNode=new TreeNode(preorder[preLeft]);
        int index=map.get(treeNode.val);
        treeNode.left=bt(preorder, preLeft+1, index-inLeft+preLeft, inLeft, index-1);
        treeNode.right=bt(preorder, index-inLeft+preLeft+1, preRight, index+1, inRight);
        return treeNode;
    }
}
