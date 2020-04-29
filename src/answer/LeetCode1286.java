package answer;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode1286 {
    class CombinationIterator {
        Queue<String> queue=new LinkedList<>();

        public CombinationIterator(String characters, int combinationLength) {
            bt(characters,combinationLength,new StringBuilder(),0);
        }

        public String next() {
            return queue.poll();
        }

        public boolean hasNext() {
            return queue.size()!=0;

        }
        private void bt(String characters, int combinationLength, StringBuilder stringBuilder,int i){
            if (stringBuilder.length()==combinationLength){
                queue.add(new String(stringBuilder));
                return;
            }
            for (int j = i; j < characters.length(); j++) {
                stringBuilder.append(characters.charAt(j));
                bt(characters, combinationLength, stringBuilder, j+1);
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
            }
        }
    }
}
