package answer;

public class LeetCode1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] r=new int[nums.length];
        for (int i=0,n=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if (nums[i]>nums[j]){
                    n++;
                }
            }
            r[i]=n;
            n=0;
        }
        return r;

    }
}
