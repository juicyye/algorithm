package basic.week1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 할리갈리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int x = sc.nextInt();

            map.put(s, map.getOrDefault(s, 0) + x);
        }

        boolean result = map.values().stream()
                .anyMatch(i -> i == 5);

        System.out.println(result ? "YES" : "NO");
    }
}
