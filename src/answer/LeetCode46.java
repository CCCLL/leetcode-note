package answer;

import java.util.ArrayList;
import java.util.List;

public class LeetCode46 {
    public static void main(String[] args) {
        new LeetCode46().permute(new int[]{1,2});
    }
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list=new ArrayList<>();
        bt(nums,list);
        return res;


    }
    private void bt(int[] nums,List<Integer> list){
        if (list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
            bt(nums,list);
            list.remove(list.size()-1);
        }
    }
}
