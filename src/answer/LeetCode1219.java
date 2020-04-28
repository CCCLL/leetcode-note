package answer;

public class LeetCode1219 {
    public static void main(String[] args) {
        int[][] arr1 = {{0,6,0},{5,8,7},{0,9,0}};
        System.out.println(new LeetCode1219().getMaximumGold(arr1));
    }
    int max=0;
    public int getMaximumGold(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]!=0)
                bt(grid,i,j,0);
            }
        }
        return max;
    }
    private void bt(int[][] grid,int row,int col,int sum){
        sum+=grid[row][col];
        int tmp=grid[row][col];
        //剪枝
        if (row-1>=0&&grid[row-1][col]!=0){
            grid[row][col]=0;
            bt(grid, row-1, col,sum);      //上
            grid[row][col]=tmp;
        }
        //剪枝
        if (row+1<grid.length&&grid[row+1][col]!=0){
            grid[row][col]=0;
            bt(grid, row+1, col,sum);       //下
            grid[row][col]=tmp;
        }
        //剪枝
        if (col-1>=0&&grid[row][col-1]!=0){
            grid[row][col]=0;
            bt(grid, row, col-1,sum);       //左
            grid[row][col]=tmp;
        }
        //剪枝
        if (col+1<grid[row].length&&grid[row][col+1]!=0){
            grid[row][col]=0;
            bt(grid, row, col+1,sum);       //右
            grid[row][col]=tmp;
        }
        max=Math.max(max,sum);
    }
}
