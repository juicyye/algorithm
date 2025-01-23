package silver.week3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 통계학 {
    private static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            map.put(value, map.getOrDefault(value, 0) + 1);
            arr[i] = value;
            max = Math.max(max, value);
            min = Math.min(min, value);
        }

        int average = average(arr);
        int middle = middle(arr);
        int maxFrequent = maxFrequent(map);
        int range = range(max, min);

        sb.append(average).append("\n");
        sb.append(middle).append("\n");
        sb.append(maxFrequent).append("\n");
        sb.append(range).append("\n");

        System.out.println(sb);

    }

    private static int average(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        return Math.round((float) sum / n);
    }

    private static int middle(int[] arr) {
        Arrays.sort(arr);
        return arr[n / 2];
    }

    private static int maxFrequent(Map<Integer, Integer> map) {
        int maxFrequency = map.values().stream()
                .max(Integer::compareTo)
                .orElse(0);

        List<Integer> mostFrequentKeys = map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == maxFrequency)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());

        return mostFrequentKeys.size() > 1 ? mostFrequentKeys.get(1) : mostFrequentKeys.get(0);
    }

    private static int range(int max, int min) {
        return max - min;
    }
}
