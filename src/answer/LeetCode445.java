package answer;

import java.util.Stack;

public class LeetCode445 {
    public static void main(String[] args) {
        ListNode l1=ListNode.getListNode(new int[] {7,2,4,3});
        ListNode l2=ListNode.getListNode(new int[] {5,6,4});
        new LeetCode445().addTwoNumbers(l1,l2);


    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        while (l1!=null){
            stack1.push(l1);
            l1=l1.next;
        }
        while (l2!=null){
            stack2.push(l2);
            l2=l2.next;
        }
        ListNode dummy=new ListNode(0);
        int carry=0;
        while (!stack1.empty()||!stack2.empty()){
            int sum=carry;
            sum+= stack1.empty() ? 0 : stack1.pop().val;
            sum+= stack2.empty() ? 0 : stack2.pop().val;
            ListNode node=new ListNode(sum%10);
            node.next=dummy.next;
            dummy.next=node;
            carry=sum/10;
        }
        if (carry>0){
            dummy.val=carry;
            return dummy;
        }else {
            return dummy.next;
        }
    }
}
