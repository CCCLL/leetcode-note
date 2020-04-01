package answer;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<index.length;i++){
            list.add(index[i],nums[i]);
        }
        int[] result=new int[list.size()];
        for (int i=0;i<list.size();i++){
                result[i]=list.get(i);
        }
        return result;


    }
}
