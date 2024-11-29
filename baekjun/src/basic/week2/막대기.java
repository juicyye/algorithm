package basic.week2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class 막대기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int i = n - 1; i >= 0; i--) {
            while(stack.isEmpty() || stack.peek() < arr[i]) {
                count++;
                stack.push(arr[i]);
            }
        }

        System.out.println(count);
    }
}
