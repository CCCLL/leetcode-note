package answer;

import java.util.HashMap;

public class LeetCode720 {
    String res;

    public String longestWord(String[] words) {
        Trie trie = new Trie();
        for (int i = 0; i < words.length; i++) {
            trie.insert(words[i]);
        }
        for (Trie.Node node : trie.root.next) {
            if (node != null) {
                trie.search(node);
            }
        }
        return res;

    }

    private class Trie {
        private class Node {
            private String word;
            private Node[] next;

            public Node(String word) {
                this.word = word;
                next = new Node[26];
            }

            public Node() {
                this(null);
            }
        }

        private Node root;

        public Trie() {
            root = new Node();
        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word) {
            Node cur = root;
            for (int i = 0; i < word.length(); i++) {
                if (cur.next[word.charAt(i) - 'a'] == null) {
                    cur.next[word.charAt(i) - 'a'] = new Node();
                }
                cur = cur.next[word.charAt(i) - 'a'];
            }
            if (cur.word == null)
                cur.word = word;
        }

        public void search(Node node) {
            if (node.word==null) return;
            if (res != null) {
                if (node.word != null && res.length() < node.word.length()) {
                    res = node.word;
                }
            } else {
                res = node.word;
            }

            for (Node node1 : node.next) {
                if (node1 != null) {
                    search(node1);
                }
            }

        }
    }
}
