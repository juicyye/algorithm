package silver.week3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class 알고리즘수업너비우선탐색1 {
    private static List<List<Integer>> graph = new ArrayList<>();
    private static int[] answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();

        answer = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }

        bfs(start);
        for (int i = 1; i <= n; i++) {
            System.out.println(answer[i]);
        }
    }

    private static void bfs(int start) {
        int count = 1;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        answer[start] = count;

        while(!queue.isEmpty()){
            Integer current = queue.poll();
            for (Integer i : graph.get(current)) {
                if (answer[i] == 0) {
                    queue.add(i);
                    answer[i] = ++count;
                }
            }
        }
    }
}
