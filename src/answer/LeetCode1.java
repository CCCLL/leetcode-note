package answer;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] res=new int[]{-1,-1};
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                res[0]=i;
                res[1]=map.get(target-nums[i]);
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
