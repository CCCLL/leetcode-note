package answer;

public class LeetCode559 {
    int res;
    public int maxDepth(Node root) {
        if (root==null) return 0;
        dt(root,0);
        return res;
    }
    public void dt(Node root,int level){
        if (root==null) return;
        if (++level>res) {
            res=level;
        }
        for (Node child : root.children) {
            dt(child,level);
        }

    }
}
