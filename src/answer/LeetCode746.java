package answer;

public class LeetCode746 {
    /*

    到达n位置的最小花费为dp（n）={ min（dp(n-1)+cost[n-1] ，dp(n-2)+cost[n-2]）}
    解释：我们定义dp(n)为到达n层的最小花费，这其中n是不花钱的，到达n位置只有两个选择要么是从n-1层上去，
    或从n-2层上去，所以到达n-1层的最小花费（dp(n-1)）需要加上n-1层的需花费的钱（cost[n-1]），才是到达n层
    的花费，n-2层到n层也同理，然后选出这两值中小的那个就是到n层的最小花费
     */

    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length+1];
        return dp(cost.length,cost,dp);



    }
    private int dp(int n,int[] cost,int[] dp){
        if (n==0||n==1){
            dp[n]=0;
            return dp[n];
        }
        if (dp[n]!=0) return dp[n];
        return dp[n]=Math.min(dp(n-1,cost,dp)+cost[n-1],dp(n-2,cost,dp)+cost[n-2]);
    }
}
