package chap_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 두배열합치기_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] brr = new int[m];
        for (int i = 0; i < m; i++) {
            brr[i] = scanner.nextInt();
        }

        List<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;
        while(p1 < n && p2 < m) {
            if(arr[p1] < brr[p2]) {
                answer.add(arr[p1++]);
            } else{
                answer.add(brr[p2++]);
            }
        }

        while(p1 < n) answer.add(arr[p1++]);
        while(p2 < m) answer.add(brr[p2++]);

        for (Integer i : answer) {
            System.out.print(i +" ");
        }
    }
}
