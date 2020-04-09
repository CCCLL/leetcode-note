package golden;

import sun.security.util.Length;

public class GoldCode0107 {
    public void rotate(int[][] matrix) {
        int n=matrix.length;       //行

        int v;
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                v=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=v;
            }
            for (int k=0;k<n/2;k++){
                v=matrix[i][k];
                matrix[i][k]=matrix[i][n-1-k];
                matrix[i][n-1-k]=v;
            }
        }
    }
}
