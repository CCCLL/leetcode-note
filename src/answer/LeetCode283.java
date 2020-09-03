package answer;

public class LeetCode283 {
    public void moveZeroes(int[] nums) {
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                int tmp=nums[k];
                nums[k++]=nums[i];
                nums[i]=tmp;
            }
        }
    }
}
