package chap_06;

import java.util.Arrays;
import java.util.Scanner;

public class 중복확인_05 {
    public static String solution(int n, int[] arr) {
        String answer = "u";
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return "d";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("solution(n,arr) = " + solution(n, arr));
    }
}
