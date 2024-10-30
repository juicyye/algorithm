package chap_03;

import java.util.Scanner;

public class 최대길이연속부분수열_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int lt = 0, count = 0, answer = 0;

        for(int rt = 0; rt < m; rt++) {
            if(arr[rt] == 0) count ++;
            while (count > m) {
                if(arr[lt]==0) count--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }


    }
}
