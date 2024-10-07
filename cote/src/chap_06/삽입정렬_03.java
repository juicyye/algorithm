package chap_06;

import java.util.Scanner;

public class 삽입정렬_03 {
    public static int[] solution(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            int tmp = arr[i] ,j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) {
                    arr[j+1] = arr[j];
                } else break;
            }
            arr[j+1] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int x : solution(n, arr)) {
            System.out.println("x = " + x);
        }
    }
}
