package answer;

import java.util.HashMap;
import java.util.Map;

public class LeetCode447 {
    public int numberOfBoomerangs(int[][] points) {
        int res=0;
        for (int i = 0; i < points.length; i++) {
            Map<Integer,Integer> map=new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i!=j){
                    int d=d(points[i],points[j]);
                    map.put(d,map.getOrDefault(d,0)+1);
                }
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue()>=2){
                    res+=entry.getValue()*(entry.getValue()-1);
                }
            }
        }
        return res;

    }
    private int d(int[] point1,int[] point2){
        return (point1[0]-point2[0]) * (point1[0]-point2[0]) + (point1[1]-point2[1]) * (point1[1]-point2[1]);
    }
}
