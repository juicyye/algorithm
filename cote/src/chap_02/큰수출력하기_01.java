package chap_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 큰수출력하기_01 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        answer.add(arr[0]);

        for (int i = 1; i < n ; i++) {
            if(arr[i] > arr[i-1]) {
                answer.add(arr[i]);
            }
        }

        for (Integer i : answer) {
            System.out.print(i+ " ");
        }


    }
}
