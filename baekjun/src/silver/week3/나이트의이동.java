package silver.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 나이트의이동 {
    private static int[][] direction = {{-2, -1}, {-1, -2}, {1, -2}, {2, -1}, {-2, 1}, {-1, 2}, {2, 1}, {1, 2}};
    private static int l;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            l = Integer.parseInt(br.readLine());
            int[] source = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int[] target = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            System.out.println(bfs(source, target));

        }
    }

    private static int bfs(int[] source, int[] target) {
        boolean[][] visited = new boolean[l][l];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{source[0], source[1]});
        visited[source[0]][source[1]] = true;
        int answer = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                int x = cur[0];
                int y = cur[1];

                if (x == target[0] && y == target[1]) {
                    return answer;
                }

                for (int[] ints : direction) {
                    int nx = x + ints[0];
                    int ny = y + ints[1];

                    if (nx >= 0 && nx < l && ny >= 0 && ny < l && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
            answer++;

        }
        return 0;
    }


}
