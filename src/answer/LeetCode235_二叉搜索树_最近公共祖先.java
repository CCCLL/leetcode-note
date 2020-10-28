package answer;

public class LeetCode235_二叉搜索树_最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val==p.val||root.val==q.val||root.val>p.val&&root.val<q.val||root.val<p.val&&root.val>q.val){
            return root;
        }
        if (root.val<p.val){
            return lowestCommonAncestor(root.right,p,q);
        }else {
            return lowestCommonAncestor(root.left,p,q);
        }

    }

}
