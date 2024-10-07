package chap_05;

import java.util.*;

public class 응급실_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
            queue.offer(new int[]{i,arr[i]});
        }
        int answer = 0;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            boolean hasHigherPriority = false;

            for (int[] ints : queue) {
                if (ints[1] > current[1]) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                queue.offer(current);
            } else{
                answer++;
                if (current[0] == b) {
                    System.out.println(answer);
                    return;
                }
            }
        }
    }

}
