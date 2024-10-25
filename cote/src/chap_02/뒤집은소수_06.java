package chap_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 뒤집은소수_06 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        List<Integer> answer = new ArrayList<>();
        for (Integer i : arr) {
            reverse(i,answer);
        }

        for (Integer i : answer) {
            System.out.print(i + " ");
        }

    }

    public static void reverse(int n, List<Integer> answer) {
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            res = res*10 + temp;
            n /= 10;
        }
        if(sosu(res)) answer.add(res);
    }

    public static boolean sosu(int n) {
        if(n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

}
