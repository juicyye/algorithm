package gold;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 보석도둑 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Jewel[] jewels = new Jewel[n];
        for (int i = 0; i < n; i++) {
            int weight = sc.nextInt();
            int price = sc.nextInt();
            jewels[i] = new Jewel(weight, price);
        }

        int[] bags = new int[k];
        for (int i = 0; i < k; i++) {
            bags[i] = sc.nextInt();
        }

        Arrays.sort(jewels);
        Arrays.sort(bags);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        long maxPrice = 0;
        int j = 0;

        for (int i = 0; i < k; i++) {
            while (j < n && jewels[j].weight <= bags[i]) {
                pq.add(jewels[j].price);
                j++;
            }

            // 가장 비싼 보석을 선택
            if (!pq.isEmpty()) {
                maxPrice += pq.poll();
            }
        }

        System.out.println(maxPrice);
    }

    static class Jewel implements Comparable<Jewel> {
        int weight;
        int price;

        public Jewel(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }

        @Override
        public int compareTo(Jewel o) {
            return weight == o.weight ? o.price - price : weight - o.weight;
        }
    }
}
