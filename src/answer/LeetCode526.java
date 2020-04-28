package answer;

import java.util.ArrayList;
import java.util.List;

public class LeetCode526 {
    public static void main(String[] args) {
        System.out.println(new LeetCode526().countArrangement(2));
    }

    int res = 0;
    public int countArrangement(int N) {
        boolean[] flag = new boolean[N];
        bt(flag, N,1);
        return res;
    }
    private void bt(boolean[] flag, int N, int count) {
        if (count  == N+1) {
            res++;
            return;
        }
        for (int j = 1; j <= N; j++) {
            if (!flag[j - 1]&&(j % count == 0 || count % j == 0)) {
                flag[j-1]=true;
                bt(flag, N,count+1);
                flag[j-1]=false;
            }
        }
    }
}
