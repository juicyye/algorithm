package silver.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 알고리즘수업깊이우선탐색1 {
    private static int n, m, count = 1;
    private static List<List<Integer>> graph = new ArrayList<>();
    private static int[] answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
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

        dfs(start);
        for (int i = 1; i <= n; i++) {
            System.out.println(answer[i]);
        }
    }

    private static void dfs(int current) {

        answer[current] = count;

        for (int v : graph.get(current)) {
            if (answer[v] == 0) {
                count++;
                dfs(v);
            }
        }
    }
}
