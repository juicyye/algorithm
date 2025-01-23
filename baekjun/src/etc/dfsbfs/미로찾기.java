package etc.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로찾기 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] graph = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String[] split = s.split("");
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(split[j]);
            }
        }
        System.out.println(bfs(graph, n, m));

    }

    public static int bfs(int[][] graph, int n, int m) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx <0 || ny <0 || nx >= n || ny >= m) continue;

                if(graph[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    graph[nx][ny] = graph[x][y] + 1;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }

        return graph[n - 1][m - 1];


    }
}
