package answer;

import java.util.HashSet;
import java.util.Set;

public class LeetCode771 {
    //暴力解法 时间复杂度O（J.length * S.length） 空间复杂度 1
    public int numJewelsInStones(String J, String S) {
        int result=0;
        for (int i=0;i<J.length();i++){
            for (int j=0;j<S.length();j++){
                if (S.charAt(j)==J.charAt(i)){
                    result++;
                }
            }
        }
        return result;

    }
    //set解法 时间复杂度O（J.length + S.length） 空间复杂度 J.length    还可用ASCII码当作数组下标自己实现位码表，效率更高
//    public int numJewelsInStones(String J, String S) {
//        Set<Character> set = new HashSet<>();
//        for(int i = 0; i < J.length(); i++) {
//            set.add(J.charAt(i));
//        }
//        int ans = 0;
//        for(int i = 0; i < S.length(); i++) {
//            if(set.contains(S.charAt(i))){
//                ans++;
//            }
//        }
//        return ans;
//    }
}
