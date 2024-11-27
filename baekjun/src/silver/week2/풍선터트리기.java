package silver.week2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class 풍선터트리기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Deque<int[]> points = new ArrayDeque<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            points.offer(new int[]{i + 1, k});
        }

        while (true) {
            int[] cur = points.poll();
            int index = cur[0];
            int nextNumber = cur[1];
            answer.add(index);

            if(points.isEmpty()) {
                break;
            }


            if (nextNumber > 0) {
                for (int i = 0; i < nextNumber - 1; i++) {
                    points.offerLast(points.poll());
                }
            } else {

                for (int i = 0; i < Math.abs(nextNumber); i++) {
                    points.offerFirst(points.pollLast());
                }
            }
        }

        for (Integer i : answer) {
            System.out.print(i+ " ");
        }

    }
}
