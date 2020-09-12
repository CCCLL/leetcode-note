package answer;

public class LeetCode125 {
    public static void main(String[] args) {
        new LeetCode125().isPalindrome("A man, a plan, a canal: Panama");
    }
    public boolean isPalindrome(String s) {
        int l=0,r=s.length()-1;
        while (l<r){
            if (!Character.isLetterOrDigit(s.charAt(l))){
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(r))){
                r--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(l))==Character.toLowerCase(s.charAt(r))){
                l++;
                r--;
            }else {
                return false;
            }
        }
        return true;
    }
}
