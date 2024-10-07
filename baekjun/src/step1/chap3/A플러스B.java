package step1.chap3;

import java.util.Scanner;

public class A플러스B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println("Case #" + i + ": "+ (x +y));
        }
    }
}
