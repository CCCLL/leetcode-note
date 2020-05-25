package answer;

import java.util.ArrayList;
import java.util.List;

public class LeetCode589 {
    private List<Integer> res=new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root==null) return res;
        d(root,res);
        return res;
    }
    private void d(Node root,List<Integer> res){
        res.add(root.val);
        for (Node child : root.children) {
            d(child,res);
        }
    }
}
