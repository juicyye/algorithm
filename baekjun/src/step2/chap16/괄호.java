package step2.chap16;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class 괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        for (int j = 0; j < i; j++) {
            String s = sc.next();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static boolean check(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if(c=='(') stack.push(c);
            else {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}
