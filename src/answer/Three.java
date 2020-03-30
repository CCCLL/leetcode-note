package answer;

import java.util.HashMap;
import java.util.Map;

public class Three {
    public static void main(String[] args) {
        int pwwkew = Three.lengthOfLongestSubstring("pwwkew");
        System.out.println(pwwkew);
    }
    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int maxLength=0;
        for (int star=0,end=0;end<s.length();end++){
            if (map.containsKey(s.charAt(end))){

            }
            maxLength=Math.max(maxLength,end-star+1);
            map.put(s.charAt(end),end);

        }

        if (s.length()==1 || s.length()==0) return s.length();
        char[] chars = s.toCharArray();
        int p1=0;
        int p2=1;
        int p=p1;
        int len=0;
        while (p2<chars.length){
            while (p<p2){
                if (chars[p]==chars[p2]){
                    if (p2-p1>len){
                        len=p2-p1;
                    }
                    p1=++p;
                    break;
                }
                p++;
            }
            p2++;
            p=p1;





        }
        return len;

    }
}
