package chap_03;

import java.util.Scanner;

public class 연속부분수열_04 {
    static int solution(int n, int m, int[] arr) {
        int answer =0, sum=0, lt=0;
        for (int rt = 0; rt < n; rt++) {
            sum+=arr[rt++];
            if(sum==m) answer++;
            while (sum >= m) {
                sum -=arr[lt++];
                if(sum==m)answer++;
            }
        }

        return answer;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 총 개수
        int m = scanner.nextInt(); // 구하는 숫자
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("solution(n,k,arr) = " + solution(n,m,arr));

    }
}
