package silver.week1;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeMap;

public class 베스트셀러 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String book = sc.nextLine();
            map.put(book, map.getOrDefault(book, 0) + 1);
        }

        Integer max = Collections.max(map.values());

        String bestSeller = map.entrySet()
                .stream()
                .filter(b -> Objects.equals(b.getValue(), max))
                .findFirst()
                .map(Entry::getKey)
                .orElse(null);

        System.out.println(bestSeller);
    }
}
