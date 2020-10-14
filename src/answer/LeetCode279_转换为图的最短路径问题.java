package answer;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode279_转换为图的最短路径问题 {
    public static void main(String[] args) {
        new  LeetCode279_转换为图的最短路径问题().numSquares(12);
    }
    public int numSquares(int n) {
        Queue<int[]> queue=new LinkedList<>();
        //状态数组避免重复数字进队列
        boolean[] flag=new boolean[n+1];
        queue.add(new int[]{n,0});
        flag[n]=true;
        while (!queue.isEmpty()){
            int sum=queue.peek()[0];
            int step=queue.peek()[1];
            queue.poll();
            if (sum==0){
                return step;
            }
            //这里的可优化点是把sum-i*i领出来计算一次
            for (int i = 1; sum-i*i>=0; i++) {
                if (!flag[sum-i*i]){
                    queue.offer(new int[]{sum-i*i,step+1});
                    flag[sum-i*i]=true;
                }
            }
        }
        return -1;

    }
}
