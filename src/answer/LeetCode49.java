package answer;

import java.util.*;

public class LeetCode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        List<List<String>> res=new LinkedList<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s=new String(chars);
            List<String> list;
            if (map.containsKey(s)){
                list=map.get(s);
            }else {
                list=new LinkedList<>();
                map.put(s,list);
                res.add(list);
            }
            list.add(str);
        }
        return res;



    }
}
