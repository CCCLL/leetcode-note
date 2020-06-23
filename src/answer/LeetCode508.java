package answer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode508 {
    int max;
    public int[] findFrequentTreeSum(TreeNode root) {
        max=0;
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        tb(root,map);
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue()==max){
                list.add(entry.getKey());
            }
        }
        int[] res=new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i]=list.get(i);
        }
        return res;

    }
    private int tb(TreeNode root, Map<Integer,Integer> map){
        if (root==null) return 0;
        int sum=root.val;
        sum+=tb(root.left,map)+tb(root.right,map);
        if (map.containsKey(sum)){
            map.put(sum,map.get(sum)+1);
        }else {
            map.put(sum,1);
        }
        max=map.get(sum)>max?map.get(sum):max;
        return sum;
    }
}
