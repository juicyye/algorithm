package step1.chap5;

import java.util.Scanner;

public class 상수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 2; i >= 0; i--) {
            sb1.append(a.charAt(i));
            sb2.append(b.charAt(i));
        }
        System.out.println(Math.max(Integer.parseInt(sb1.toString()), Integer.parseInt(sb2.toString())));
    }
}
