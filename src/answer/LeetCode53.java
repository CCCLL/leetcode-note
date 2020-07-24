package answer;

public class LeetCode53 {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int sum=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (sum<0){
                sum=nums[i];
            }else {
                sum+=nums[i];
            }
            res= Math.max(res,sum);
        }
        return res;
    }
}
