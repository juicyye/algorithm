package cote._24_7;

import java.util.Arrays;

public class 문자열내p와y의개수 {
    public static boolean solution(String s) {
        boolean answer = true;

        Long pcount = Arrays.stream(s.toLowerCase().split("")).filter(c -> c.equals("p")).count();
        Long ycount = Arrays.stream(s.toLowerCase().split("")).filter(c -> c.equals("y")).count();

        if(pcount.equals(ycount)) {
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s = "pPoooyY";
        String s1 = "Pyy";
        System.out.println(solution(s));
        System.out.println("solution(s1) = " + solution(s1));

    }
}
