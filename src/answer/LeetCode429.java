package answer;

import java.util.ArrayList;
import java.util.List;

public class LeetCode429 {
    List<List<Integer>> res;
    public List<List<Integer>> levelOrder(Node root) {
        res=new ArrayList<>();
        if (root==null) return res;
        bt(root,0);
        return res;
    }
    private void bt(Node root,int level){
        if (res.size()<=level){
            res.add(new ArrayList<>());
        }
        res.get(level).add(root.val);
        for (Node child : root.children) {
            bt(child,level+1);
        }

    }
}
