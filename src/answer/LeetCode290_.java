package answer;

import javax.lang.model.element.VariableElement;
import java.util.HashMap;
import java.util.Map;

public class LeetCode290_ {
    public boolean wordPattern(String pattern, String str) {
        String[] s = str.split(" ");
        // 如果长度不匹配
        if (s.length != pattern.length() ) {
            return false;
        }

        HashMap<Character,String> record = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            // 如果 record 中没有保存当前遍历到的元素
            if ( !record.containsKey(pattern.charAt(i)) ) {
                // 却保存了本该一一对应的数组 s 中的元素
                if (record.containsValue(s[i]) ) {
                    return false;
                }
                // 如果都没有保存，就将其对应关系一同存放进 record 中
                record.put(pattern.charAt(i), s[i]);
            } else {
                // 如果原本就已经保存在 record 中，那就比较其对应关系是否一致
                if ( !record.get(pattern.charAt(i)).equals(s[i]) ) {
                    return false;
                }
            }
        }
        return true;
    }
}
