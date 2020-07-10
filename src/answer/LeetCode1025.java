package answer;

public class LeetCode1025 {
    public static void main(String[] args) {
        new LeetCode1025().divisorGame(2);
    }
    public boolean divisorGame(int N) {
        boolean[] dp=new boolean[N+1];
        for (int i = 2; i < dp.length; i++) {
            for (int j = 1; j < i; j++) {
                if (i%j==0){
                    if (!dp[i-j]){
                        dp[i]=!dp[i-j];
                        break;
                    }
                }
            }
        }
        return dp[N];

    }
}
