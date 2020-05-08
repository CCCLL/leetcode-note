package answer;

public class LeetCode876 {
    public ListNode middleNode(ListNode head) {
        int index=1;
        ListNode res=head;
        while (head!=null){
            if (index%2==0){
                res=res.next;
            }
            head=head.next;
            index++;
        }
        return res;
    }
}
