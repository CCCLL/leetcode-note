package answer;

public class LeetCode59 {
    public static void main(String[] args) {
        new LeetCode59().generateMatrix(3);
    }
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int l=0;
        int r=n-1;
        int u=0;
        int f=n-1;
        int count=1;
        while (count<=n*n){
            for (int j=l;j<=r;j++){
                res[u][j]=count++;
            }
            u++;
            for (int j=u;j<=f;j++){
                res[j][r]=count++;
            }
            r--;
            for (int j=r;j>=l;j--){
                res[f][j]=count++;
            }
            f--;
            for (int j=f;j>=u;j--){
                res[j][l]=count++;
            }
            l++;
        }
        return res;

    }
}
