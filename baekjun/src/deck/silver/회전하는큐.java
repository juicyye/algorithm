package deck.silver;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class 회전하는큐 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] targets = new int[m];

        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        Deque<Integer> source = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            source.add(i);
        }

        System.out.println(solution(targets, source));

    }

    private static int solution(int[] targets, Deque<Integer> source) {
        int answer = 0;
        for (int target : targets) {
            int index = 0;
            for (Integer i : source) {
                if (target == i) {
                    break;
                }
                index++;
            }

            int lt = index;
            int rt = source.size() - index;
            answer += Math.min(lt, rt);

            if (lt <= rt) {
                for (int i = 0; i < lt; i++) {
                    source.addLast(source.pollFirst());
                }
            } else {
                for (int i = 0; i < rt; i++) {
                    source.addFirst(source.pollLast());
                }
            }
            source.pollFirst();
        }

        return answer;
    }

}
