package etc.이분탐색;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 숫자카드2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        int m = sc.nextInt();
        int[] quires = new int[m];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            Integer od = map.getOrDefault(a, 0);
            sb.append(od).append(" ");
        }

        System.out.println(sb);


    }
}
