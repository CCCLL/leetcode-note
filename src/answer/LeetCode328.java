package answer;

public class LeetCode328 {
    public ListNode oddEvenList(ListNode head) {
        if (head==null) return head;
        ListNode dummyO=new ListNode(0);
        ListNode curO=dummyO;
        ListNode dummyE=new ListNode(0);
        ListNode curE=dummyE;
        int index=1;
        while (head!=null){
            if (index%2==0){
                curE.next=head;
                head=head.next;
                curE=curE.next;
                curE.next=null;
            }else {
                curO.next=head;
                head=head.next;
                curO=curO.next;
                curO.next=null;
            }
            index++;
        }
        curO.next=dummyE.next;
        return dummyO.next;

    }
}
