package answer;



public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
        if (head==null)
            return head;
        ListNode pre=null;
        while (head!=null){
            ListNode next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}
