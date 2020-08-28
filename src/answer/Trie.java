package answer;

import java.util.HashMap;

public class Trie {

    private class Node{
        private boolean isWord;
        private HashMap<Character,Node> next;
        public Node(boolean isWord){
            this.isWord=isWord;
            next=new HashMap<>();
        }
        public Node(){
            this(false);
        }
    }
    private Node root;
    /** Initialize your data structure here. */
    public Trie() {
        root=new Node();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node cur=root;
        for (int i = 0; i < word.length(); i++) {
            if (!cur.next.containsKey(word.charAt(i))){
                cur.next.put(word.charAt(i),new Node());
            }
            cur=cur.next.get(word.charAt(i));
        }
        if (!cur.isWord)
            cur.isWord=true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node cur=root;
        for (int i = 0; i < word.length(); i++) {
            if (!cur.next.containsKey(word.charAt(i))){
               return false;
            }
            cur=cur.next.get(word.charAt(i));
        }
        return cur.isWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node cur=root;
        for (int i = 0; i < prefix.length(); i++) {
            if (!cur.next.containsKey(prefix.charAt(i))){
                return false;
            }
            cur=cur.next.get(prefix.charAt(i));
        }
        return true;
    }
}
