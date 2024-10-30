package chap_03;

import java.util.Scanner;

public class 연속된자연수합_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int k = n / 2 + 1;

        int[] arr = new int[n];
        for (int i = 1; i <= k; i++) {
            arr[i] = i;
        }
        int sum = 0, answer =0, lt = 1;
        for (int i = 1; i <= k; i++) {
            sum += arr[i];
            if(sum == n) answer++;
            while (sum >= n) {
                sum -= arr[lt++];
                if(sum == n) answer++;
            }
        }
        System.out.println(answer);


    }
}
