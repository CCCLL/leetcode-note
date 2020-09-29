package answer;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode150_逆波兰表达式求值_stack {

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {

            if ("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token)) {
                int y = stack.poll();
                int x = stack.poll();
                switch (token) {
                    case "+":
                        stack.push(x + y);
                        break;
                    case "-":
                        stack.push(x - y);
                        break;
                    case "*":
                        stack.push(x * y);
                        break;
                    case "/":
                        stack.push(x / y);
                        break;
                }
            } else {
                stack.push(Integer.valueOf(token));
            }

        }
        return stack.poll();
    }
}
