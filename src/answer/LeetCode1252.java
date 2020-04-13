package answer;

public class LeetCode1252 {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] res=new int[n][m];
        int count=0;
        for (int i=0;i<indices.length;i++){
            for (int j=0;j<m;j++){
                res[indices[i][0]][j]+=1;
            }
            for (int j=0;j<n;j++){
                res[j][indices[i][1]]+=1;
            }
        }
        for (int i=0;i<res.length;i++){
            for (int j=0;j<res[i].length;j++){
                if ((res[i][j]&1)==1){
                    count++;
                }
            }
        }
        return count;

    }
}
