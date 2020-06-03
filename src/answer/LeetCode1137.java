package answer;

public class LeetCode1137 {
    public int tribonacci(int n) {
        if (n<2) return n;


        return bt(0,1,1,2,n);

    }
    private int bt(int t0,int t1,int t2,int index,int n){
        if (index==n) return t2;
        return bt(t1,t2,t0+t1+t2,index+1,n);
    }
}
