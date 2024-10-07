package step1.chap5;

import java.util.Scanner;

public class 문자열 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.nextLine();

        for (int j = 0; j < i; j++) {
            String a = scanner.nextLine();
            String[] split = a.split("");
            System.out.println(split[0] + split[a.length() - 1]);


        }
    }
}
