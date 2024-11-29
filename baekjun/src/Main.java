import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Main {

    /**
     * 국회의원 선거
     *
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt() - 1;
        int dasom = sc.nextInt();
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        while (n-- > 0) {
            queue.offer(sc.nextInt());
        }

        int count = 0;
        while (!queue.isEmpty() && queue.peek() >= dasom) {
            dasom++;
            count++;
            queue.offer(queue.poll() - 1);
        }

        System.out.println(count);
    }

}