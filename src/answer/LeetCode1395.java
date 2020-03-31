package answer;

public class LeetCode1395 {
    /**
     * 解题思路
     * 遍历中间的士兵，统计 左边/右边 比他 小/大 的士兵人数。
     *
     * 每名士兵在中间的情况下可以组队的数量为：
     * 左边比他小的人数 × 右边比他大的人数 + 左边比他大的人数 × 右边比他小的人数
     *
     * 公式为：\sum_{}(left[0] * right[1] + left[1] * right[0])∑
     * ​
     *  (left[0]∗right[1]+left[1]∗right[0])
     *
     * 时间复杂度：一个for循环为O(n)O(n)，两次count函数O(n)O(n)，故总的时间复杂度为O(n^2)O(n
     * 2
     *  )。
     * 空间复杂度：O(1)O(1)。
     *
     * @param rating
     * @return
     */
    public int numTeams(int[] rating) {
        int lmin=0;
        int rmax=0;
        int lmax=0;
        int rmin=0;
        int num=0;

        for (int i=1;i<rating.length-1;i++){
            for (int j=i-1;j>=0;j--){
                if (rating[j]>rating[i]){
                    lmax++;
                }else {
                    lmin++;
                }
            }
            for (int j=i+1;j<rating.length;j++){
                if (rating[i]>rating[j]){
                    rmin++;
                }else {
                    rmax++;
                }
            }
            num=num+lmin*rmax+lmax*rmin;
            lmin=0;
            rmax=0;
            lmax=0;
            rmin=0;
        }
        return num;

    }
}
