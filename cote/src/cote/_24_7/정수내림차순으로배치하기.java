package cote._24_7;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class 정수내림차순으로배치하기 {
    public static long solution(long n) {
        Queue<Long> queue = new PriorityQueue<>(Comparator.reverseOrder());
        String[] split = String.valueOf(n).split("");
        for (String s : split) {
            queue.add(Long.parseLong(s));
        }
        StringBuilder stringBuilder = new StringBuilder();
        while(!queue.isEmpty()) {
            stringBuilder.append(queue.poll());
        }


        return Long.parseLong(stringBuilder.toString());
    }
    public static void main(String[] args) {
        long n = 118372;
        System.out.println(solution(n));


    }
}
