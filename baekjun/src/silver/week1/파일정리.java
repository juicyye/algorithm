package silver.week1;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class 파일정리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new TreeMap<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            countExtension(s.split("\\."),map);
        }

        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void countExtension(String[] split, Map<String, Integer> map) {
        String s = split[1];
        map.put(s, map.getOrDefault(s, 0) + 1);
    }


}
