package cote._24_7;

import java.util.Arrays;

public class 다음큰숫자 {
    public static int solution(int n) {
        int count = Integer.bitCount(n);
        while (true) {
            n++;
            if (count == Integer.bitCount(n)) {
                return n;
            }
        }
    }

    public static void main(String[] args) {
        int n = 78;
        int n2 = 15;

        System.out.println("solution(n) = " + solution(n));
        System.out.println("solution(n) = " + solution(n2));

    }
}
