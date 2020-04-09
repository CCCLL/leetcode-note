package answer;

public class LeetCode1351 {

    public int countNegatives(int[][] grid) {
        int rowIndex=grid.length-1;       //行
        int columnIndex=grid[0].length-1; //列
        int res=0;
        int index=-1;
        for (int i=0;i<=rowIndex;i++){
            for (int j=0;j<=columnIndex;j++){
                index=binarySearch(grid[i],j,columnIndex,0);
                if (index<0){
                    break;
                }else {
                    if (true)
                    columnIndex=index-1;
                    break;
                }
            }
        }
        while (grid[rowIndex][columnIndex]<0 && columnIndex>=0 && rowIndex>=0){
            res++;
            columnIndex--;
            rowIndex--;
        }
        return 1;



    }
    private int binarySearch(int[] nums,int left,int right,int n){
        int mid=(left+right)>>2;
        while (left<=right){
            if (nums[mid]<0&&nums[mid-1]<1){
                return mid;
            }else if (nums[mid]>n){
                left=mid+1;
            }else {
                right=mid-1;
            }
            mid=(left+right)/2;
        }
        return -1;
    }

}
