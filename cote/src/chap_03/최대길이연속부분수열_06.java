package chap_03;

import java.util.Scanner;

public class 최대길이연속부분수열_06 {
    static int solution(int n, int k, int[] arr) {
        int answer =0, cnt=0, lt=0;
        for (int rt = 0; rt < n; rt++) {
            if(arr[rt]==0) cnt++;
            while (cnt > k) {
                if(arr[lt]==0)cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }

        return answer;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //
        int m = scanner.nextInt(); //
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("solution(n,k,arr) = " + solution(n,m,arr));

    }
}
