package chap_05;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기_05 {
    static int solution(String a) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if(a.charAt(i-1)=='(') answer += stack.size();
                else answer++;
            }
        }

        return answer;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println("solution(n,k,arr) = " + solution(a));

    }
}
