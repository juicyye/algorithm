package chap_10;

import java.util.*;

public class 다익스트라알고리즘_05 {

    private static int n,m;
    private static List<List<Edge>> graph;
    private static int[] dis;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<List<Edge>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        dis = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(b, c));
        }
        solution(1);

        for (int i = 2; i <= n; i++) {
            if(dis[i]!= Integer.MAX_VALUE) System.out.println(i+ " : " +dis[i]);
            else System.out.println(i +" : impossible");

        }
    }

    static void solution(int v) {
        PriorityQueue<Edge> queue = new PriorityQueue<>();
        queue.offer(new Edge(v, 0));
        dis[v] = 0;
        while(!queue.isEmpty()) {
            Edge temp = queue.poll();
            int now = temp.vex;
            int nowCost = temp.cost;
            if(nowCost>dis[now]) continue;
            for (Edge ob : graph.get(now)) {
                if (dis[ob.vex] > nowCost + ob.cost) {
                    dis[ob.vex] = nowCost + ob.cost;
                    queue.offer(new Edge(ob.vex, nowCost + ob.cost));
                }

            }
        }

    }

    static class Edge implements Comparable<Edge> {
        int vex;
        int cost;

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }
}
