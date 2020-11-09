package answer;

import java.util.ArrayList;
import java.util.List;

public class LeetCode39_回溯 {
    public static void main(String[] args) {
        List<List<Integer>> list=new LeetCode39_回溯().combinationSum(new int[]{2,3,6,7},7);
        System.out.println(list);

    }
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list=new ArrayList<>();
        bt(candidates,target,list,0,0);
        return res;

    }
    private void bt(int[] candidates, int target,List<Integer> list,int i,int sum){
        if (sum==target){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int j = i; j < candidates.length; j++) {
            if (sum+candidates[j]>target){
                continue;
            }
            list.add(candidates[j]);
            sum+=candidates[j];
            bt(candidates, target, list,j,sum);
            sum-=list.get(list.size()-1);
            list.remove(list.size()-1);
        }
    }
}
