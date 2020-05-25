package answer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode590 {

    public List<Integer> postorder(Node root) {
        List<Integer> res=new ArrayList<>();
        if (root==null) return res;
        Stack<Node> nodeStack=new Stack<>();
        Stack<Integer> integerStack=new Stack<>();

        nodeStack.push(root);
        while (!nodeStack.isEmpty()){
            root=nodeStack.pop();
            integerStack.push(root.val);
            for (Node child : root.children) {
                if (child!=null){
                    nodeStack.push(child);
                }
            }
        }
        while (!integerStack.isEmpty()){
            res.add(integerStack.pop());
        }
        return res;

    }
    private void dfs(Node root,List<Integer> res){

        for (Node child : root.children) {
            dfs(child,res);
        }
        res.add(root.val);
    }
}
