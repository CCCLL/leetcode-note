package answer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LeetCode438 {
    public static void main(String[] args) {
        System.out.println(new LeetCode438().findAnagrams("cbaebabacd", "abc"));
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new LinkedList<>();
        Map<Character,Integer> w=new HashMap<>();
        Map<Character,Integer> need=new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            need.put(p.charAt(i),need.getOrDefault(p.charAt(i),0)+1);
        }
        int v=0;
        int l=0,r=0;
        while (r<s.length()){
            char c=s.charAt(r);
            r++;
            if (need.containsKey(c)){
                w.put(c,w.getOrDefault(c,0)+1);
                if (need.get(c).equals(w.get(c))){
                    v++;
                }
            }
            while (r-l>=p.length()){
                if (v==need.size()){
                    res.add(l);
                }
                char d=s.charAt(l);
                l++;
                if (w.containsKey(d)){
                    if (w.get(d).equals(need.get(d))){
                        v--;
                    }
                    w.put(d,w.get(d)-1);
                }
            }

        }
        return res;

    }
}
