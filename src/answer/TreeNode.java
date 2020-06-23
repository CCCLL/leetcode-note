package answer;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int x) {
        val = x;
    }
    public static TreeNode getTreeNode(int[] ints){
        Integer[] integers=new Integer[ints.length];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]==0){
                integers[i]=null;
            }else {
                integers[i]=new Integer(ints[i]);
            }
        }
        return tb(integers,0);
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
