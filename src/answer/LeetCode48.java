package answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode48 {
    public static void main(String[] args) {
        System.out.println(new LeetCode48().combinationSum2(new int[]{1, 2, 2, 2, 5}, 5));
    }
    List<List<Integer>> res=new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(candidates);
        bt(list,candidates,target,0);
        return res;
    }
    private void bt(List<Integer> list,int[] candidates, int target,int i){
        if (target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int j = i; j < candidates.length; j++) {
            if (candidates[j]>target){
                continue;
            }
            if(j>i&&candidates[j]==candidates[j-1]){
                continue;
            }
            list.add(candidates[j]);
            bt(list, candidates, target-candidates[j], j+1);
            list.remove(list.size()-1);
        }

    }
}
