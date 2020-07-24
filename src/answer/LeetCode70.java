package answer;

public class LeetCode70 {
    public int climbStairs(int n) {
        if (n<=2){
            return n;
        }
        int pre=1;
        int aft=2;
        int res=0;
        for (int i = 3; i <= n; i++) {
            res=pre+aft;
            pre=aft;
            aft=res;
        }
        return res;
    }
}
