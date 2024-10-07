package step1.chap5;

import java.util.Scanner;

public class 문자와문자열 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = scanner.nextInt();
        String[] split = s.split("");
        System.out.println(split[i-1]);
    }
}
