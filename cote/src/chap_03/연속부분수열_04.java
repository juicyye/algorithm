package chap_03;

import java.util.Scanner;

public class 연속부분수열_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 총 개수
        int m = scanner.nextInt(); // 구하는 숫자
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int lt = 0, sum = 0, answer = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if(sum == m)answer++;
            while (sum >= m) {
                sum -= arr[lt++];
                if(sum == m)answer++;
            }
        }

        System.out.println(answer);


    }
}
