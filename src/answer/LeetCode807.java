package answer;

public class LeetCode807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] colMaxs=new int[grid[0].length];
        int[] rowMaxs=new int[grid.length];
        int sum=0;
        int before=0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid.length;j++){
                rowMaxs[i] = Math.max(grid[i][j],rowMaxs[i]);
                colMaxs[j] = Math.max(grid[i][j],colMaxs[j]);
            }
        }
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid.length;j++){
                before=grid[i][j];
                grid[i][j] = Math.min(colMaxs[j],rowMaxs[i]);
                sum+=grid[i][j]-before;
            }
        }
        return sum;
    }
}
