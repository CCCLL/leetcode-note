package answer;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode20_括号匹配_stack {
    public boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='('||c=='{'||c=='['){
                stack.push(c);
            }else {
                if (stack.isEmpty()) return false;
                // ( 和 ) ASCII码值相差1，{ 和 } 相差2， [ 和 ] 相差2
//                if (Math.abs(stack.peek()-c)<=2){
//                    stack.poll();
//                }else {
//                    return false;
//                }
                Character poll = stack.poll();
                if (c==')'){
                    if (poll!='(') return false;
                }else if (c==']'){
                    if (poll!='[') return false;
                }else if (c=='}'){
                    if (poll!='{') return false;
                }else {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) return true;
        else return false;

    }
}
