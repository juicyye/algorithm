package step1.chap4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 개수세기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            int x = scanner.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int c = scanner.nextInt();
        Integer result = map.get(c);
        System.out.println(result == null ? 0 : result);

    }
}
