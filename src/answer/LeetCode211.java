package answer;

import java.util.HashMap;

public class LeetCode211 {
    class WordDictionary {

        private class Node{
            private boolean isWord;
            private HashMap<Character, Node> next;
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
        public WordDictionary() {
            root=new Node();
        }

        /** Adds a word into the data structure. */
        public void addWord(String word) {
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

        /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
        public boolean search(String word) {
            return search(root,word,0);
        }
        private boolean search(Node cur,String word,int index){
            if (word.length()==index){
                return cur.isWord;
            }
            char c=word.charAt(index);
            if (c=='.'){
                for (Character character : cur.next.keySet()) {
                    if (search(cur.next.get(character),word,index+1)){
                        return true;
                    }
                }
                return false;
            }
            if (cur.next.containsKey(c)){
                return search(cur.next.get(c),word,index+1);
            }
            return false;
        }
    }
}
