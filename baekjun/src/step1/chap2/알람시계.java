package step1.chap2;

import java.util.Scanner;

public class 알람시계 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int b = scanner.nextInt();

        int m = b - 45;
        if (m < 0) {
            m +=60;
            h-=1;
        }
        if (h < 0) {
            h += 24;
        }
        System.out.println(h + " " +m);

    }
}
