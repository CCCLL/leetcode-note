package answer;

import java.util.Stack;

public class LeetCode1047 {
    public static void main(String[] args) {
        System.out.println(new LeetCode1047().removeDuplicates("abbaca"));
    }
    public String removeDuplicates(String S) {
        Stack<Character> stack=new Stack<>();
        for (int i = S.length()-1; i >=0 ; i--) {
            if (!stack.isEmpty() && stack.peek()==S.charAt(i)){
                stack.pop();
            }else {
                stack.push(S.charAt(i));
            }
        }
        StringBuilder stringBuilder=new StringBuilder();
        int len=stack.size();
        for (int i = 0; i < len; i++) {
            stringBuilder.append(stack.pop());
        }

        return stringBuilder.toString();

    }
}
