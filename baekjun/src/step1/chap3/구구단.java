package step1.chap3;

import java.util.Scanner;

public class 구구단 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(a + " * " + i +" = " + a*i);
        }
    }
}
