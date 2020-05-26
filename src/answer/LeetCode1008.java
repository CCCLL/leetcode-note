package answer;

public class LeetCode1008 {
    public TreeNode bstFromPreorder(int[] preorder) {
        return dt(preorder,0,preorder.length-1);

    }
    private TreeNode dt(int[] preorder,int left,int right){
        if (left>right) return null;
        TreeNode root=new TreeNode(preorder[left]);

        int index=left;
        for (; index <=right; index++) {
            if (preorder[left]<preorder[index]){
                break;
            }
        }
        root.left=dt(preorder, left+1, index-1);
        root.right=dt(preorder, index, right);
        return root;

    }
}
