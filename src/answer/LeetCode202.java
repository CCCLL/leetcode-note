package answer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode202 {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while (n!=1&&!set.contains(n)){
            set.add(n);
            n=helper(n);
        }
        return n==1;
    }
    private int helper(int n){
        int res=0;
        while (n>0){
            res+=(n%10)*(n%10);
            n=n/10;
        }
        return res;
    }
}
