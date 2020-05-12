package answer;

public class LeetCode147 {
    public static void main(String[] args) {

    }
    public ListNode insertionSortList(ListNode head) {
        if (head==null||head.next==null) return head;
        ListNode dummy=new ListNode(Integer.MIN_VALUE);
        ListNode pre=dummy;
        ListNode cur=head;
        while (cur!=null){
            ListNode tmp=cur.next;
            while (pre.next!=null&&pre.next.val<cur.val){
                pre=pre.next;
            }
            cur.next=pre.next;
            pre.next=cur;
            cur=tmp;
            pre=dummy;
        }


        return dummy.next;
    }

}
