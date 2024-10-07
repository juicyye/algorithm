package step1.chap4;

import java.util.Scanner;

public class 과제안내신분 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[31];

        for (int i = 0; i < 28; i++) {
            int b = scanner.nextInt();
            data[b] = b;
        }

        for (int i = 1; i <= 30; i++) {
            if (data[i] == 0) {
                System.out.println(i);
            }
        }

    }
}
