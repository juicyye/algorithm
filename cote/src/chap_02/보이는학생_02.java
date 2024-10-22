package chap_02;

import java.util.Scanner;

public class 보이는학생_02 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
                count++;
            }
        }
        System.out.println(count);



    }
}
