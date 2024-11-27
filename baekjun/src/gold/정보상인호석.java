package gold;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 정보상인호석 {
    private static Map<String, PriorityQueue<Integer>> info = new HashMap();
    private static Scanner sc = new Scanner(System.in);
    private static long answer = 0;


    public static void main(String[] args) {
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int k = sc.nextInt();
            if (k == 1) {
                getInfo();
            } else {
                buyInfo();
            }
        }

        System.out.println(answer);
    }

    private static void getInfo() {
        String name = sc.next();
        int c = sc.nextInt();

        PriorityQueue<Integer> value = info.computeIfAbsent(name, k -> new PriorityQueue<>(Comparator.reverseOrder()));

        for (int i = 0; i < c; i++) {
            value.add(sc.nextInt());
        }
    }

    private static void buyInfo() {
        String name = sc.next();
        int b = sc.nextInt();

        PriorityQueue<Integer> value = info.get(name);
        if (value == null || value.isEmpty()) {
            return;
        }

        int availableInfoCount = Math.min(b, value.size());

        for (int i = 0; i < availableInfoCount; i++) {
            answer += value.poll();
        }

    }
}
