package answer;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int x) {
        val = x;
    }
    public static TreeNode getTreeNode(Integer[] ints){
        return tb(ints,0);
    }
    private static TreeNode tb(Integer[] ints,int index){
        if (index>=ints.length) return null;
        TreeNode root=ints[index]==null?null:new TreeNode(ints[index]);
        if (root==null)return root;
        root.left=tb(ints,index*2+1);
        root.right=tb(ints,index*2+2);
        return root;
    }

}
