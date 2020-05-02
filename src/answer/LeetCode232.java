package answer;

import java.util.Stack;

public class LeetCode232 {
    class MyQueue {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> outStack = new Stack<>();
        int head;


        /**
         * Initialize your data structure here.
         */
        public MyQueue() {

        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            if (stack.isEmpty())
                head = x;
            stack.push(x);

        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            if (outStack.isEmpty()) {
                int len = stack.size();
                for (int i = 0; i < len; i++) {
                    outStack.push(stack.pop());
                }
            }
            return outStack.pop();
        }

        /**
         * Get the front element.
         */
        public int peek() {
            if (outStack.isEmpty()) {
                return head;
            } else {
                return outStack.peek();
            }
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return stack.isEmpty() && outStack.isEmpty();
        }
    }
}
