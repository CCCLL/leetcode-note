package answer;

public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy;
        ListNode del=head;
        ListNode f=head;
        while (f!=null){
            if (n<=0){
                pre=pre.next;
                del=del.next;
            }
            f=f.next;
            n--;
        }
        pre.next=del.next;
        return dummy.next;

    }
}
