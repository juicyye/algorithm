package step2.chap13;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class 수정렬하기4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[String.valueOf(n).length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = n % 10;
            n /= 10;
        }

        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
