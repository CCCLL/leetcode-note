package answer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode1282 {
    public static void main(String[] args) {
        groupThePeople(new int[]{3,3,3,3,3,1,3});
    }
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> resList = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (!map.containsKey(groupSizes[i])) {
                map.put(groupSizes[i], new ArrayList<>());
            } else if (map.get(groupSizes[i]).size() == groupSizes[i]) {
                resList.add(map.remove(groupSizes[i]));
                map.put(groupSizes[i], new ArrayList<>());
            }
            map.get(groupSizes[i]).add(i);
            }
        for (Integer integer : map.keySet()) { //把剩余的组添加进结果中
            resList.add(map.get(integer));
        }
        return resList;
    }
}
