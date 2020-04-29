package answer;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode1381 {
    class CustomStack {
        Deque<Integer> cStack ;
        Deque<Integer> fStack ;
        int size;

        public CustomStack(int maxSize) {
            size=maxSize;
            cStack = new ArrayDeque<>(maxSize);
            fStack = new ArrayDeque<>(maxSize);

        }

        public void push(int x) {
            if (cStack.size()<size){
                cStack.push(x);
            }
        }

        public int pop() {
            if (cStack.isEmpty()){
                return -1;
            }else {
                return cStack.pop();
            }
        }

        public void increment(int k, int val) {
            int len=cStack.size();
            for (int i = 0; i < len; i++) {
                fStack.push(cStack.poll());
            }
            for (int i = 0; i < len; i++) {
                if (k-->0){
                    cStack.push(fStack.poll()+val);
                }else {
                    cStack.push(fStack.poll());
                }

            }
        }
    }
}
