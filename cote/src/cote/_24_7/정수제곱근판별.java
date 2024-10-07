package cote._24_7;

public class 정수제곱근판별 {
    public static long solution(long n) {
        Long sqrt = (long) Math.sqrt(n);
        Long pow = (long) Math.pow(sqrt, 2);

        if (pow.equals(n)) {
            return (long) Math.pow(sqrt + 1, 2);
        }
        return -1;

    }
    public static void main(String[] args) {
        int n = 121;
        int n2 = 3;

        System.out.println("solution(n) = " + solution(n));
        System.out.println("solution(n) = " + solution(n2));

    }
}
