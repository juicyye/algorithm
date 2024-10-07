package step3.chap33;

import java.util.Arrays;
import java.util.Scanner;

public class 두수의합 {
    public static void main(String[] args) {
        // n개의 서로 다른 양의 정수로 이루어진 수열이 있다
        // ai의 값은 1보다 크거나 같고 10000000보다 작거나 같은 자연수이다.
        // 자연수 x가 주어졌을 떄 ai + aj = x를 만족하는 (ai,aj)의 쌍을 구하는 프로그램
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int[] data = new int[i];
        for (int j = 0; j < i; j++) {
            int a = scanner.nextInt();
            data[j] = a;
        }

        int i1 = scanner.nextInt();
        int count = 0;

        Arrays.sort(data);
        int lt = 0;
        int rt = data.length-1;

        while (lt < rt) {
            if (data[lt] + data[rt] == i1) {
                count++;
                lt++;
                rt--;
            } else if (data[lt] + data[rt] > i1) {
                rt--;
            } else{
                lt++;
            }
        }

        System.out.print(count);
    }
}
