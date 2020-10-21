package answer;

import java.util.*;

public class LeetCode127_转换为图的最短路径问题_BFS {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Node> queue = new LinkedList<>();
        Set<String> set = new HashSet<>();
        queue.offer(new Node(beginWord, 1));
        set.add(beginWord);
        while (!queue.isEmpty()) {
            Node pollNode = queue.poll();
            for (String s : wordList) {
                if (!set.contains(s)) {
                    int count = 0;
                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) != pollNode.word.charAt(i)) {
                            count++;
                        }
                    }
                    if (count == 1) {
                        if (s.equals(endWord)) {
                            return pollNode.step + 1;
                        }
                        queue.offer(new Node(s, pollNode.step + 1));
                        set.add(s);
                    }
                }
            }
        }
        return 0;

    }

    private class Node {
        private String word;
        private int step;

        public Node(String word, int step) {
            this.word = word;
            this.step = step;
        }

        public int getStep() {
            return step;
        }

        public void setStep(int step) {
            this.step = step;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }
    }
}
