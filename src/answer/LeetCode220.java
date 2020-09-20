package answer;

import java.util.TreeSet;

public class LeetCode220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> treeSet=new TreeSet<>();
        int i=0,j=0;
        while (j<nums.length){

            if (treeSet.ceiling((long)nums[j])!=null&&treeSet.ceiling((long)nums[j])-nums[j]<=t || treeSet.floor((long)nums[j])!=null&&nums[j]-treeSet.floor((long)nums[j])<=t){
                return true;
            }
            treeSet.add((long)nums[j++]);
            if (j-i>k){
                treeSet.remove((long)nums[i++]);
            }

        }
        return false;

    }
}
