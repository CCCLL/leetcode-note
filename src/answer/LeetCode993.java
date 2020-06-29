package answer;

public class LeetCode993 {
    int[][] ints;
    public boolean isCousins(TreeNode root, int x, int y) {
        ints=new int[][]{{0,0},{0,0}};
        helper(0,0,root,x,y);
        if (ints[0][0]!=ints[1][0]&&ints[0][1]==ints[1][1]){
            return true;
        }
        return false;
    }
    private void helper(int father,int level,TreeNode root,int x,int y){
        if (root==null) return;
        if (root.val==x){
            ints[0][0]=father;
            ints[0][1]=level;
        }else if (root.val==y){
            ints[1][0]=father;
            ints[1][1]=level;
        }
        helper(root.val,level+1,root.left,x,y);
        helper(root.val,level+1,root.right,x,y);
    }
}
