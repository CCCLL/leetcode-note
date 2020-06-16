package answer;

public class LeetCode116 {
    public Node connect(Node root) {
        helper(root,null);
        return root;

    }
    private void helper(Node root,Node rootNext){
        if (root==null) return;
//        root.next=rootNext;
//        helper(root.left,root.right);
//        helper(root.right,rootNext==null?rootNext:rootNext.left);

    }
}
