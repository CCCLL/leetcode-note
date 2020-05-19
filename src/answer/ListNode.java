package answer;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }
    public static ListNode getListNode(int[] ints){
        ListNode head=new ListNode(ints[0]);
        ListNode index=head;
        for (int i = 1; i < ints.length; i++) {
            index.next=new ListNode(ints[i]);
            index=index.next;
        }
        return head;
    }
}
