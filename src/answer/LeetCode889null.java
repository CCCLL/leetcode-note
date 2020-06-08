package answer;

import java.util.HashMap;
import java.util.Map;

public class LeetCode889null {
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        Map<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < post.length; i++) {
            map.put(post[i],i);
        }
        return tb(pre,0,pre.length-1,post,0,post.length-1,map);
    }
    private TreeNode tb(int[] pre, int preLeft, int preRight, int[] post, int postLeft, int postRight, Map<Integer,Integer> map){

        TreeNode root=new TreeNode(post[postRight--]);
        if(preLeft==preRight) return root;
        int index=map.get(pre[++preLeft]);
        root.left=tb(pre, preLeft, index-postLeft+preLeft, post, postLeft, index, map);
        root.right=tb(pre, index-postLeft+preLeft+1, preRight, post, index+1, postRight, map);
        return root;
    }
}
