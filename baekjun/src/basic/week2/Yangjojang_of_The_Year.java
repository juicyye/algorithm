package basic.week2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Yangjojang_of_The_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                String school = sc.next();
                int alcohol = sc.nextInt();
                map.put(school, map.getOrDefault(school, 0) + alcohol);
            }
            map.entrySet()
                    .stream()
                    .max(Map.Entry.comparingByValue())
                    .ifPresent(c -> System.out.println(c.getKey()));
        }



    }
}
