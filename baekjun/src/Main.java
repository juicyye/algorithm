import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    /**
     * 최대 힙? priorityQueue
     * HashMap
     */
    public static void main(String[] args) throws IOException {
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