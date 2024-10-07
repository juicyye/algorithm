package etc;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class 쇠막대기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Deque<Character> stack = new ArrayDeque<Character>();
        int answer = 0 ;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') stack.push(s.charAt(i));
            else{
                stack.pop();
                if(s.charAt(i-1)=='(') answer+=stack.size();
                else answer++;
            }
        }
        System.out.println(answer);
    }
}
