package step1.chap1;

import java.util.Scanner;

public class 곱셈 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String[] split = String.valueOf(b).split("");
        System.out.println(a * Integer.valueOf(split[2]));
        System.out.println(a * Integer.valueOf(split[1]));
        System.out.println(a * Integer.valueOf(split[0]));
        System.out.println(a * b);
    }
}
