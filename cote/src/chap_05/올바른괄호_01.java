package chap_05;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호_01 {
    static String solution(String a) {
        String answer = "yes";
        Stack<Character> stack = new Stack<>();
        for (char x : a.toCharArray()) {
            if (x == '(') {
                stack.push('x');
            } else if (stack.isEmpty()) {
                return "no";
            }
            else stack.pop();
        }
        if(!stack.isEmpty()) return "no";

        return answer;


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println("solution(n,k,arr) = " + solution(a));

    }
}
