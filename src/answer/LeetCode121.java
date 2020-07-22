package answer;

public class LeetCode121 {
    public int maxProfit(int[] prices) {
        int res=0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                res= Math.max(res,prices[j] - prices[i]);
            }
        }
        return res;

    }
}
