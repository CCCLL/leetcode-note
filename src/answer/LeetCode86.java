package answer;

public class LeetCode86 {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyMin=new ListNode(0);
        ListNode dummyMax=new ListNode(0);
        ListNode min=dummyMin;
        ListNode max=dummyMax;

        while (head!=null){
            if (head.val<x){
                min.next=head;
                min=min.next;
                head=head.next;
                min.next=null;
            }else {
                max.next=head;
                max=max.next;
                head=head.next;
                max.next=null;
            }
        }
        min.next=dummyMax.next;
        return dummyMin.next;
    }
}
