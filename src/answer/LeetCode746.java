package answer;

public class LeetCode746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        boolean flag=false;
        for (int i = 1; i < cost.length; i++) {
            if (flag){
                dp[i]=dp[i-1];
            }else {

                if (cost[i]<cost[i-1]){
                    dp[i]=dp[i-1]+cost[i];
                    flag=true;
                }else {
                    dp[i]=dp[i-1]+cost[i-1];
                    flag=false;
                }
            }
        }
        return dp[dp.length-1];

    }
}
