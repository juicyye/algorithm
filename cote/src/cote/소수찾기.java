package cote;

public class 소수찾기 {
    static int solution(int n) {
        int count = 0;

        for (int num = 2; num <= n; num++) {
            if (isPrime(num)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i<= Math.sqrt(num); i++) { // 소수를 구할때 제곱근까지만 구해도 나옴
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
