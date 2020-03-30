package sfo;

public class sixtyFour {
    public int sumNums(int n) {
//        if (n==1){
//            return n;
//        }
//        return n+sumNums(n-1);

        //因不能用if，故使用短路机制停止递归
        int result = 0;
        boolean b = n > 0 && (result = n + sumNums(n-1)) > 0;
        return result;


    }

}
