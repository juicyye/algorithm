package chap_02;

import java.util.Scanner;

public class 가위바위보_03 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int A = a[i];
            int B = b[i];

            if (A == B) {
                System.out.println("D"); // 비김
            } else if ((A == 1 && B == 3) || (A == 2 && B == 1) || (A == 3 && B == 2) ) {
                System.out.println("A"); // A가 이김
            } else {
                System.out.println("B"); // B가 이김
            }
        }

        scanner.close();



    }
}
