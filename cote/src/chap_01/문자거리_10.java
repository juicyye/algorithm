package chap_01;

import java.util.Arrays;
import java.util.Scanner;

public class 문자거리_10 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        String s = split[0];
        char t = split[1].charAt(0);  // 문자 t를 얻음

        int[] arr = new int[s.length()];
        int count = 1000;  // 매우 큰 수로 초기화 (문자열 길이보다 큰 값)

        // 왼쪽에서 오른쪽으로 최소 거리 계산
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                count = 0;
            } else {
                count++;
            }
            arr[i] = count;
        }

        // 오른쪽에서 왼쪽으로 최소 거리 계산
        count = 1000;  // 다시 큰 수로 초기화
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                count = 0;
            } else {
                count++;
            }
            arr[i] = Math.min(arr[i], count);
        }

        // 결과 출력
        for (int n : arr) {
            System.out.print(n + " ");
        }

    }
}
