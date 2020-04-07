package sfo;

public class SwordFingerOffer17 {
    public int[] printNumbers(int n) {
        if (n<1){
            return new int[0];
        }
        int max=9;

        while (n>1){
            max=max*10+9;
            n--;
        }
        int[] res=new int[max];
        for (int i=1;i<=res.length;i++){
            res[i-1]=i;
        }
        return res;
    }
}
