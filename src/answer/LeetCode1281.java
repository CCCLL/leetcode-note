package answer;

public class LeetCode1281 {
    public static void main(String[] args) {
        int i=(int) Math.log10(999);
        System.out.println(i);
    }
    public int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        while (n!=0){
            product=(n%10)*product;
            sum=sum+(n%10);
            n=n/10;
        }
        return product-sum;
    }
}
