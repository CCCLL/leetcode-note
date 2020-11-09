package answer;


import java.util.HashMap;
import java.util.Map;

public class LeetCode106_回溯 {
    public static void main(String[] args) {
        new LeetCode106_回溯().buildTree(new int[]{1,2,3,4},new int[]{3,2,4,1});
    }
    private Map<Integer,Integer> map;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map=new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return bt(postorder,0,postorder.length-1,0,inorder.length-1);
    }
    private TreeNode bt(int[] postorder, int postLeft, int postRight, int inLeft, int inRight){
        if (postLeft>postRight || inLeft>inRight) return null;
        int index=map.get(postorder[postRight]);
        TreeNode root=new TreeNode(postorder[postRight]);
        root.left=bt(postorder, postLeft, index+postLeft-1-inLeft, inLeft, index-1);
        root.right=bt(postorder, index+postLeft-inLeft, postRight-1, index+1, inRight);
        return root;

    }

}
