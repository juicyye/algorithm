package silver.week2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class 센티와마법의뿅망치 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int centi = sc.nextInt();
        int availableCount = sc.nextInt();


        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < people; i++) {
            queue.add(sc.nextInt());
        }

        int count = 0;
        boolean allShorter = false;


        while (availableCount-- > 0) {
            int tallest = queue.poll();
            if (tallest < centi) {
                allShorter = true;
                break;
            }


            if (tallest > 1) {
                queue.offer(tallest / 2);
            } else{
                break;
            }

            count++;
        }


        int maxHeight = queue.isEmpty() ? 1 : queue.peek();

        if (allShorter || maxHeight < centi) {
            System.out.println("YES");
            System.out.println(count);
        } else {
            System.out.println("NO");
            System.out.println(maxHeight);
        }
    }

}
