package answer;

import java.util.ArrayList;
import java.util.List;

public class LeetCode257 {
    public static void main(String[] args) {
        TreeNode root=TreeNode.getTreeNode(new Integer[]{new Integer(1),new Integer(2),new Integer(3),null,new Integer(5)});
        new LeetCode257().binaryTreePaths(root);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        if (root==null) return res;
        tb(root,new StringBuilder(),res);
        return res;
    }
    private void tb(TreeNode root,StringBuilder s,List<String> res){
        if (root.right==null&&root.left==null){
            res.add(s.toString()+root.val);
            return;
        }
            String tmp = root.val + "->";
            s.append(tmp);
            if (root.left != null) {
                tb(root.left, s, res);
            }
            if (root.right != null) {
                tb(root.right, s, res);
            }
            s.delete(s.length() - tmp.length(), s.length());

    }
}
