package answer;

public class LeetCode1290 {

    //反转链表解法，纯属想练下反转链表
    public int getDecimalValue(ListNode head) {
        if (head.next==null){
            return head.val;
        }
        ListNode p1=head.next;
        ListNode p2=p1.next;
        head.next=null;
        while (p2!=null){
            p1.next=head;
            head=p1;
            p1=p2;
            p2=p2.next;
        }
        p1.next=head;
        head=p1;
        int i=0;
        int sum=0;
        while (head!=null){
            if (head.val==1){
                sum+=Math.pow(2,i);
            }
            i++;
            head=head.next;
        }
        return sum;


    }
    //位运算解法
//    public int getDecimalValue(ListNode head) {
//        int sum=0;
//        while (head!=null){
//            sum=(sum << 1) + head.val;
//            head=head.next;
//        }
//        return sum;
//
//
//    }
}
