package chap_02;

import java.util.ArrayList;
import java.util.Scanner;

public class 뒤집은소수_06 {
    static boolean isPrime(int num) {
        if(num == 1)return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
    static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res* 10 + t;
                tmp /=10;
            }
            if(isPrime(res)) answer.add(res);
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int x : solution(n, a)) {
            System.out.println("x = " + x);
        }



    }

}
