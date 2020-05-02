package answer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode933 {
    class RecentCounter {
        Queue<Integer> queue=new LinkedList<>();
        public RecentCounter() {

        }

        public int ping(int t) {
            queue.add(t);
            while (t-3000>queue.peek()){
                queue.poll();
            }
            return queue.size();
        }
    }
}
