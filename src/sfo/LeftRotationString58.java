package sfo;

public class LeftRotationString58 {


    public String reverseLeftWords(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder(s.substring(n));
        stringBuilder.append(s.substring(0, n));

        return stringBuilder.toString();


    }

}
