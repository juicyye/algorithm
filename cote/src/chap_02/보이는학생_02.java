package chap_02;

import java.util.ArrayList;
import java.util.Scanner;

public class 보이는학생_02 {
    static int solution(int n, int[] arr) {
        int answer = 1;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                answer++;
                max = arr[i];
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
