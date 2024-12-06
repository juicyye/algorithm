package silver.week2;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class 식당입구대기줄 {
    private static Queue<Integer> queue = new ArrayDeque<>();
    private static Scanner sc = new Scanner(System.in);
    private static int student = Integer.MAX_VALUE, size = 0;
    public static void main(String[] args) {


        int n = sc.nextInt();

        while (n-- > 0) {
            int info = sc.nextInt();
            solution(info);
        }

        System.out.println(size + " " + student);
    }


    public static void solution(int info){
        if (info == 1) {
            int lastStudent = sc.nextInt();
            queue.offer(lastStudent);
            if (queue.size() > size || (queue.size() == size && lastStudent < student)) {
                size = queue.size();
                student = lastStudent;
            }
        } else{
            queue.poll();
        }
    }
}

