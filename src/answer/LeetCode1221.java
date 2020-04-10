package answer;

public class LeetCode1221 {
    public int balancedStringSplit(String s) {
        char[] chars=s.toCharArray();
        int count=0;
        int res=0;
        for(int i=0;i<chars.length;i++){
            if ('R'==chars[i]){
                count++;
            }else {
                count--;
            }
            if (count==0){
                res++;
            }
        }
        return res;
    }
}
