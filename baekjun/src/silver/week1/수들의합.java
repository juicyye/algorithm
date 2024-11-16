package silver.week1;

import java.util.Scanner;

public class 수들의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        int answer = 0, lt = 1, sum = 0;

        for(int rt = 1; rt <= n; rt++) {
            sum+=arr[rt];
            if(sum == n) answer ++;
            while (sum >= n) {
                sum -= arr[lt++];
                if(sum == n) answer ++;
            }
        }
        System.out.println(answer);
    }
}
