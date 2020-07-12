package sfo;

public class SwordFingerOffer47 {
    public static void main(String[] args) {
        System.out.println(new SwordFingerOffer47().maxValue(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
    }
    public int maxValue(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        dp[0][0]=grid[0][0];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i==0 && j==0){
                    continue;
                }
                if (i==0 && j!=0){
                    dp[i][j]=dp[i][j-1]+grid[i][j];
                    continue;
                }
                if (j==0 && i!=0){
                    dp[i][j]=dp[i-1][j]+grid[i][j];
                    continue;
                }
                dp[i][j]=Math.max(dp[i-1][j]+grid[i][j],dp[i][j-1]+grid[i][j]);
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
