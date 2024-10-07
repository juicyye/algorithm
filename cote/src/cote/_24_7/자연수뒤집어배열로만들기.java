package cote._24_7;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class 자연수뒤집어배열로만들기 {
    public static int[] solution(long n) {
        String[] split = String.valueOf(n).split("");
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = split.length-1; i >=0; i--) {
            queue.offer(Integer.parseInt(split[i]));
        }
        return queue.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        long n = 12345;
        System.out.println("Arrays.toString(solution(n)) = " + Arrays.toString(solution(n)));

    }
}
