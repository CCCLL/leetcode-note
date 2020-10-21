package answer;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LeetCode347_优先队列_大顶堆 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] res=new int[k];
        PriorityQueue<int[]> priorityQueue=new PriorityQueue<>((o1,o2)-> o2[0]-o1[0]
        );
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (Integer integer : map.keySet()) {
            priorityQueue.add(new int[]{map.get(integer),integer});
        }
        for (int i = 0; i < res.length; i++) {
            res[i]=priorityQueue.poll()[1];
        }
        return res;

    }
}
