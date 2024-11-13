package basic;

import java.util.Scanner;

public class 검증수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int number = sc.nextInt();
            sum += Math.pow(number, 2);
        }
        int result = sum % 10;
        System.out.println(result);
    }
}

