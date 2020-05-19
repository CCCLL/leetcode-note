package answer;

import java.util.HashSet;
import java.util.Set;

public class LeetCode817 {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> set=new HashSet<>();
        for (int i : G) {
            set.add(i);
        }
        int res=0;
        boolean flag=false;
        while (head!=null){
            if (set.contains(head.val)){
                if (!flag){
                    res++;
                    flag=true;
                }
            }else {
                flag=false;
            }
            head=head.next;
        }
        return res;
    }
}
