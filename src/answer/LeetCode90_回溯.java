package answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode90_回溯 {
    public static void main(String[] args) {
        System.out.println(new LeetCode90_回溯().subsetsWithDup(new int[]{1, 2, 2}));
    }
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        bt(nums,new ArrayList<Integer>(),0);
        return res;

    }
    private void bt(int[] nums,List<Integer> list,int i){
        res.add(new ArrayList<>(list));
        for (int j = i; j < nums.length; j++) {
            if (j>i&&nums[j-1]==nums[j]){
                continue;
            }
            list.add(nums[j]);
            bt(nums, list, j+1);
            list.remove(list.size()-1);
        }
    }
}
