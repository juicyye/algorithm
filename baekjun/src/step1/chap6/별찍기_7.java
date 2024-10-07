package step1.chap6;

import java.util.Scanner;

public class 별찍기_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = a - i ; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = a-1; i >= 1; i--) {
            for (int j = 0 ; j < a- i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
