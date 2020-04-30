package answer;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode921 {
    public int minAddToMakeValid(String S) {
        Deque<Character> stack=new ArrayDeque<>();
        for (int i = 0; i < S.length(); i++) {
            if (stack.isEmpty()){
                stack.push(S.charAt(i));
            }else {
                if (stack.peek()=='(' && S.charAt(i)==')'){
                    stack.pop();
                }else {
                    stack.push(S.charAt(i));
                }
            }
        }
        return stack.size();
    }
}
