package answer;

public class LeetCode1304 {
    public int[] sumZero(int n) {
        int[] res=new int[n];
        if (n==1){
            return res;
        }
        int tmp=n/2;
        for (int i=0,k=tmp;i<n;i++,k--){
            res[i]=k;
        }
        if ((n&1)==0){
            res[tmp]=-tmp;
        }
        return res;
    }
}
