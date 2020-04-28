package answer;

import java.util.ArrayList;
import java.util.List;

public class LeetCode784 {
    public static void main(String[] args) {
        new LeetCode784().letterCasePermutation("a1b2");
    }
    public List<String> letterCasePermutation(String S) {
        List<String> res=new ArrayList<>();
        char[] chars=S.toCharArray();
        bt(chars,res,0);
        return res;

    }
    private void bt(char[] chars,List<String> res,int i){
        res.add(new String(chars));
        for (int j = i; j < chars.length; j++) {
            char c=chars[j];
            if (Character.isLowerCase(chars[j])){
                chars[j]=Character.toUpperCase(chars[j]);
                bt(chars,res,j+1);
            }else if (Character.isUpperCase(chars[j])){
                chars[j]=Character.toLowerCase(chars[j]);
                bt(chars,res,j+1);
            }else {
                continue;
            }
            chars[j]=c;
        }
    }
}
