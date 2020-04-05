package answer;
//错误答案
public class LeetCode1315 {
    public int sumEvenGrandparent(TreeNode root) {
        return sumEven(root,false,root.val%2==0);
    }
    private int sumEven(TreeNode treeNode,boolean isAdd,boolean even){
        if (treeNode==null){
            return 0;
        }
        if (isAdd){
            return treeNode.val+sumEven(treeNode.left,even,treeNode.val%2==0)+sumEven(treeNode.right,even,treeNode.val%2==0);
        }else {
            return sumEven(treeNode.left,even,treeNode.val%2==0)+sumEven(treeNode.right,even,treeNode.val%2==0);
        }
    }
}
