package answer;

public class LeetCode1342 {
    public int numberOfSteps (int num) {
        if (num==0){
            return 0;
        }
        if (num%2==0){
            num=num/2;
        }else {
            num=num-1;
        }
        return 1+numberOfSteps(num);
    }
//    -2的二进制为1111 1110
//    public int numberOfSteps (int num) {
//        int count = 0;
//        while (num != 0) {
//            count++;
//            num = (num & 1) == 1 ? num & -2 : num >> 1;
//        }
//        return count;
//    }

}
