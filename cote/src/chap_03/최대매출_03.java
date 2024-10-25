package chap_03;

import java.util.Scanner;

public class 최대매출_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //총 일수
        int k = scanner.nextInt(); // 연속몇일
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        int answer = 0;

        for (int i = 0; i < k; i++) {
            sum+=arr[i];
            answer = sum;
        }

        for(int i = k; i < n; i++) {
            sum += (arr[i]-arr[i-k]);
            answer = Math.max(answer, sum);
        }

        System.out.println(answer);



    }
}
