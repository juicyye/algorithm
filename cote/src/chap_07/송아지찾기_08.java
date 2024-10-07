package chap_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지찾기_08 {

    public static void main(String[] args) {
        송아지찾기_08 t = new 송아지찾기_08();
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        int[] ch = new int[10001];

        int[] dis = {1, -1, 5};
        System.out.println(bfs(start, end, queue, dis, ch));


    }

    public static int bfs(int s, int e, Queue<Integer> queue, int[] dis, int[] ch) {
        ch[s] = 1;
        queue.offer(s);
        int level = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Integer x = queue.poll();
                for (int di : dis) {
                    int nx = x + di;
                    if(nx==e) return level + 1;
                    if(nx >= 1 && nx <=10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            level++;
        }
        return 0;

    }


}
