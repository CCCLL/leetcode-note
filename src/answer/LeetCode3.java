package answer;

import java.util.HashMap;
import java.util.Map;

public class LeetCode3 {
    public static void main(String[] args) {
        System.out.println(new LeetCode3().lengthOfLongestSubstring("abba"));
    }
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        Map<Character,Integer> map=new HashMap<>();
        int l=0,r=0;
        int len=1;
        map.put(s.charAt(0),0);
        while (r+1<s.length()){
            if (map.containsKey(s.charAt(++r))&&map.get(s.charAt(r))>=l){
                l=map.get(s.charAt(r))+1;
                map.put(s.charAt(r),r);

            }else {
                map.put(s.charAt(r),r);
            }
            len= Math.max(len,r-l+1);
        }
        return len;

    }

}
