package answer;

public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            if (val!=nums[i]){
                nums[res++]=nums[i];
            }
        }
        return res;
    }
}
