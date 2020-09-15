package answer;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LeetCode451_使用java大顶堆实现 {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        //                                                    此处对应lambda表达式为：(o1, o2) -> o2.getValue()-o1.getValue()
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        maxHeap.addAll(map.entrySet());
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            for (Integer i = 0; i < entry.getValue(); i++) {
                res.append(entry.getKey());
            }
        }
        return res.toString();


    }
}
