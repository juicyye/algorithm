package step2.chap14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 숫자카드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(sc.nextInt(), 1);
        }

        int m = sc.nextInt();
        int[] answer = new int[m];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            answer[i] = map.getOrDefault(a, 0);
        }

        for (int i : answer) {
            System.out.print(i+ " ");
        }

    }
}
