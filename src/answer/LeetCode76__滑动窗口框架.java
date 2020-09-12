package answer;

import java.util.HashMap;
import java.util.Map;


/*

        滑动窗口算法框架
    void slidingWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int valid = 0;
        while (r < s.length()) {
            // c 是将移入窗口的字符
            char c = s[right];
            // 右移窗口
            right++;
            // 进行窗口内数据的一系列更新
            ...

            debug 输出的位置
            printf("window: " + left + "   " + right);

            // 判断左侧窗口是否要收缩
            while (window needs shrink){
                // d 是将移出窗口的字符
                char d = s.charAt(l);
                // 左移窗口
                left++;
                // 进行窗口内数据的一系列更新
                ...
            }
        }
    }

*/

public class LeetCode76__滑动窗口框架 {

    public String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> w = new HashMap<>();
        int v = 0;
        int l = 0, r = 0;
        int len = s.length() + 1;
        int index = 0;
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        while (r < s.length()) {
            char c = s.charAt(r);
            r++;
            if (need.containsKey(c)) {
                w.put(c, w.getOrDefault(c, 0) + 1);
                if (w.get(c).equals(need.get(c))) {
                    v++;
                }
            }
            while (v == need.size()) {
                if (r - l < len) {
                    len = r - l;
                    index = l;
                }
                char d = s.charAt(l);
                l++;
                if (need.containsKey(d)) {
                    if (need.get(d).equals(w.get(d))) {
                        v--;
                    }
                    w.put(d, w.get(d) - 1);
                }
            }

        }
        if (len == s.length() + 1) return "";
        return s.substring(index, index + len);


    }
}
