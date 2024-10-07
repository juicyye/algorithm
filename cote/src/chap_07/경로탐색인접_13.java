package chap_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 경로탐색인접_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        int[] ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        ch[1] = 1;
        System.out.println(dfs(1,ch,graph,n));

    }

    static int dfs(int start, int[] ch, List<List<Integer>> graph, int n) {
        if (start == n) return 1;
        int answer = 0;

        for (int nv : graph.get(start)) {
            if (ch[nv] == 0) {
                ch[nv] = 1;
                answer += dfs(nv, ch, graph, n);
                ch[nv] = 0;
            }
        }

        return answer;
    }


}
