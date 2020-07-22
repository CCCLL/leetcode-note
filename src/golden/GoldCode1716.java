package golden;

import java.util.Arrays;

public class GoldCode1716 {
    int[] dp;
    public int massage(int[] nums) {
        dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return dp(nums,0);

    }
    private int dp(int[] nums,int index){
        if (index>=nums.length){
            return 0;
        }
        if (dp[index]>=0){
            return dp[index];
        }
        int s1=nums[index]+dp(nums,index+2);
        int s2=dp(nums,index+1);
        dp[index]=Math.max(s1,s2);
        return dp[index];
    }
}
