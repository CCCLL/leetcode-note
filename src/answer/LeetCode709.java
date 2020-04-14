package answer;

public class LeetCode709 {
    public String toLowerCase(String str) {
        char[] chars=str.toCharArray();
        for (int i=0;i<chars.length;i++){
            if ('A'<=chars[i]&&chars[i]<='Z')
            chars[i] +='a' - 'A';
        }
        return String.valueOf(chars);

    }
}
