package answer;

public class LeetCode677 {
    class MapSum {

        private class Node {
            private int val;
            private Node[] next;

            public Node(int val) {
                this.val = val;
                next = new Node[26];
            }

            public Node() {
                this(0);
            }
        }

        private Node root;

        /** Initialize your data structure here. */
        public MapSum() {
            this.root=new Node();
        }

        public void insert(String key, int val) {
            Node cur=root;
            for (int i = 0; i < key.length(); i++) {
                if (cur.next[key.charAt(i)-'a']==null){
                    cur.next[key.charAt(i)-'a']=new Node();
                }
                cur=cur.next[key.charAt(i)-'a'];
            }
            cur.val=val;
        }

        public int sum(String prefix) {
            Node cur=root;
            for (int i = 0; i < prefix.length(); i++) {
                if (cur.next[prefix.charAt(i)-'a']==null){
                    return 0;
                }
                cur=cur.next[prefix.charAt(i)-'a'];
            }
            return dfs(cur);

        }
        private int dfs(Node root){
            int sum=root.val;
            for (Node node : root.next) {
                if (node!=null){
                    sum+=dfs(node);
                }
            }
            return sum;
        }
    }
}
