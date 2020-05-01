package answer;

import java.util.Stack;

public class LeetCode628 {
    public int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack();
        int res=0;
        for (int i = 0; i < ops.length; i++) {
            switch (ops[i].charAt(0)){
                case 'C':
                    res-=stack.pop();
                    break;
                case 'D':
                    stack.push(stack.peek()*2);
                    res+=stack.peek();
                    break;
                case '+':
                    int t=stack.pop();
                    int sum=t+stack.peek();
                    stack.push(t);
                    stack.push(sum);
                    res+=stack.peek();
                    break;
                default:
                    stack.push(Integer.valueOf(ops[i]));
                    res+=stack.peek();
            }
        }
        return res;
    }
}
