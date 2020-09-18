package answer;

import java.util.HashMap;
import java.util.Map;

public class LeetCode454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer,Integer> sumAB=new HashMap<>();
        int res=0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int tmp=A[i]+B[j];
                sumAB.put(tmp,sumAB.getOrDefault(tmp,0)+1);
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int tmp=C[i]+D[j];
                if (sumAB.containsKey(0-tmp)){
                    res+=sumAB.get(0-tmp);
                }
            }
        }
        return res;


    }
}
