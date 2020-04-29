package answer;

import java.util.ArrayList;
import java.util.List;

public class LeetCode47null {
    public static void main(String[] args) {
        System.out.println(new LeetCode47null().permuteUnique(new int[]{1, 1, 2}));
    }
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] flag=new boolean[nums.length];
        List<Integer> list=new ArrayList<>();
        bt(nums,flag,list);
        return res;
    }
    private void bt(int[] nums,boolean[] flag,List<Integer> list){
        if (list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (flag[i] ){
                continue;
            }
            list.add(nums[i]);
            flag[i]=true;
            bt(nums, flag, list);
            flag[i]=false;
            list.remove(list.size()-1);
        }
    }
}
