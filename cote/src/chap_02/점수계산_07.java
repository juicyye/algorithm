package chap_02;

import java.util.Scanner;

public class 점수계산_07 {
    static int solution(int n, int[] arr) {
        int answer = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==0) {
                cnt++;
                answer +=cnt;
            }
            else cnt = 0;
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("solution(n,arr) = " + solution(n, arr));
    }

}
