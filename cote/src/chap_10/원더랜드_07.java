package chap_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 원더랜드_07 {
    private static int[] unf;
    private static int n;
    private static int m;

    public static int find(int v) {
        if(v==unf[v]) return v;
        else return unf[v]=find(unf[v]);
    }

    public static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if(fa != fb) unf[fa] = fb;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        unf = new int[n+1];
        List<Edge> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.add(new Edge(a,b,c));
        }

        int answer = 0;
        Collections.sort(arr);

        for (Edge edge : arr) {
            int fv1 = find(edge.v1);
            int fv2 = find(edge.v2);
            if (fv1 != fv2) {
                answer+=edge.cost;
                union(edge.v1,edge.v2);
            }
        }

        System.out.println(answer);
    }
    static class Edge implements Comparable<Edge> {
        private int v1;
        private int v2;
        private int cost;

        public Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }
}
