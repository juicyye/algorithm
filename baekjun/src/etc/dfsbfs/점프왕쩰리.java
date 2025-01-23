package etc.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 점프왕쩰리 {
    private static boolean answer = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        boolean[][] visited = new boolean[n][n];
        dfs(map, 0, 0, visited, n);
        if (answer) {
            System.out.println("HaruHaru");
        } else{
            System.out.println("Hing");
        }

    }


    public static void dfs(int[][] map, int x, int y, boolean[][] visited, int n) {
        if(map[x][y] == -1) {
            answer = true;
            return;
        }

        visited[x][y] = true;
        int jump = map[x][y];

        if(x + jump <n && !visited[x + jump][y]) {
            dfs(map, x + jump, y, visited, n);
        }
        if(y + jump <n && !visited[x][y + jump]) {
            dfs(map, x, y + jump, visited, n);
        }

    }

    public static void bfs(int[][] map,int n) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            int jump = map[x][y];

            if(map[x][y] == -1) {
                System.out.println("HaruHaru");
                return;
            }

            if(x + jump <n && !visited[x + jump][y]) {
                queue.offer(new int[]{x + jump, y});
            }
            if(y + jump <n && !visited[x][y + jump]) {
                queue.offer(new int[]{x, y + jump});
            }
        }
        System.out.println("Hing");
    }
}
