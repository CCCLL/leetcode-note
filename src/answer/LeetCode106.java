package answer;


import java.util.HashMap;
import java.util.Map;

public class LeetCode106 {
    public static void main(String[] args) {
        new LeetCode106().buildTree(new int[]{1,2,3,4},new int[]{3,2,4,1});
    }
    private Map<Integer,Integer> map;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map=new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return dt(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
    }
    private TreeNode dt(int[] inorder, int[] postorder,int il,int ir,int pl,int pr){
        if (il==ir) return new TreeNode(inorder[il]);
        if (il>ir||pl>pr) return null;
        TreeNode treeNode=new TreeNode(postorder[pr]);
        int index = map.get(postorder[pr]);
        //记住边界的计算
        treeNode.left=dt(inorder, postorder,il,index-1,pl,pr-ir+index-1);
        treeNode.right=dt(inorder, postorder,index+1,ir,pr-ir+index,pr-1);
        return treeNode;
    }
}
