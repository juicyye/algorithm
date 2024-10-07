package chap_05;

import java.util.Scanner;
import java.util.Stack;

public class 후위식연산_04 {
    static int solution(String a) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : a.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x-48);
            } else{
                int rt = stack.pop();
                int lt = stack.pop();
                if(x =='+') stack.push(rt + lt);
                else if (x == '-') {
                    stack.push(lt - rt);
                }
            }
        }

        return stack.get(0);


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println("solution(n,k,arr) = " + solution(a));

    }
}
