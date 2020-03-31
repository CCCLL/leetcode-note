package answer;

public class LeetCode1295 {

    //还有一种解法将int转为String，调用.length

    //可直接使用log
    public int findNumbers(int[] nums) {
        int result=0;
        int count=0;
        for (int i : nums){
            while (i!=0){
                i=i/10;
                count++;
            }
            if (count%2==0){
                result++;
            }
            count=0;
        }
        return result;
    }
}
