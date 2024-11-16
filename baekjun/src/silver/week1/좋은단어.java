package silver.week1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class 좋은단어 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (char c : s.toCharArray()) {
                if(!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                } else{
                    stack.push(c);
                }
            }
            if(stack.isEmpty()) answer++;
            stack.clear();
        }

        System.out.println(answer);
    }
}
