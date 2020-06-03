package golden;

import java.util.ArrayList;
import java.util.List;

public class GoldCode0805 {
    public static void main(String[] args) {
        List<Integer> A=new ArrayList<>();
        A.add(2);
        A.add(1);
        A.add(0);

        new GoldCode0805().hanota(A,new ArrayList<>(),new ArrayList<>());
    }
    public int multiply(int A, int B) {
        int tmp=A;
        A= A < B ? A : B;
        B= B>tmp?B:tmp;
          if(A==0){
            return 0;
        }else if (A>=2){
            return (B<<1) + multiply(A-2,B);
        }else {
            return B+multiply(A-1,B);
        }

    }
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        move(A.size(),A, B, C);
    }

    public void move(int n, List<Integer> A, List<Integer> B, List<Integer> C){
        //当长度等于1时候，直接移动就可以
        if(n == 1) {
            C.add(A.remove(A.size() - 1));
            return ;
        }
        //先把 n - 1 移动到 B
        move(n - 1,A,C,B);
        //把A的最后一个元素，移动到C
        C.add(A.remove(A.size() - 1));
        //把B移动到C
        move(n - 1,B,A,C);
    }

}
