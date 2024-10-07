package chap_05;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거_02 {
    static String solution(String a) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : a.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(') ;
            } else stack.push(x);

        }
        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }
        return answer;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println("solution(n,k,arr) = " + solution(a));

    }
}
