package chap_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class 교육과정설계_07 {
    static String solution(String need, String plan) {
        String answer = "yes";
        Queue<Character> q = new LinkedList<>();
        for (char x : need.toCharArray()) {
            q.offer(x);
        }
        for (char x : plan.toCharArray()) {
            if (q.contains(x)) {
                if(x!=q.poll()) return "no";
            }
        }
        if (!q.isEmpty()) {
            return "no";
        }
        return answer;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println("solution(n,k,arr) = " + solution(a,b));

    }
}
