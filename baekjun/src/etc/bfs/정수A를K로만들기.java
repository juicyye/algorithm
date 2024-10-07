package etc.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 정수A를K로만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(bfs(a, k));
    }

    public static int bfs(int a, int k) {
        Queue<int[]> q = new LinkedList<>();
        boolean[] visited = new boolean[k + 1];

        visited[a] = true;
        q.add(new int[]{a, 0});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int num = cur[0];
            int count = cur[1];

            if (num == k) {
                return count;
            }

            if(num + 1 <= k && !visited[num + 1]) {
                q.add(new int[]{num + 1, count+1});
                visited[num + 1] = true;
            }

            if(num * 2 <= k && !visited[num * 2]) {
                q.add(new int[]{num * 2, count+1});
                visited[num * 2] = true;
            }

        }
        return -1;
    }
}
