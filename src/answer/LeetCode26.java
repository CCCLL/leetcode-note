package answer;

public class LeetCode26 {
    //i维护答案数组
    public int removeDuplicates(int[] nums) {
        if (nums.length<2) return nums.length;
        int i = 0,j=1;
        for (; j < nums.length; j++) {
            if (nums[i]!=nums[j]){
                nums[++i]=nums[j];
            }
        }
        return i+1;
    }
}
