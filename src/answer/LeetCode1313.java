package answer;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1313 {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i += 2) {

            for (int j = nums[i]; j > 0; j--) {
                list.add(nums[i + 1]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;


    }
}
