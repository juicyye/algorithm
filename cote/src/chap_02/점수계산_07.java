package chap_02;

import java.util.Scanner;

public class 점수계산_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count ++;
            } else count = 0;
            answer+=count;
        }
        System.out.println(answer);

    }

}
