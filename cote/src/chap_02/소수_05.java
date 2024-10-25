package chap_02;

import java.util.Scanner;

public class 소수_05 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if(sosu(i)) answer++;
        }
        System.out.println(answer);

    }

    public static boolean sosu(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
