package chap_02;

import java.util.Scanner;

public class 피보나치수열_04 {
    static int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i = 2; i < n; i++) {
            answer[i]=answer[i-2]+answer[i-1];
        }
        return answer;
    }

    static void solution2(int n) {
        int a=1, b=1, c;
        for (int i = 2; i < n; i++) {
            c = a+b;
            a= b;
            b = c;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int x: solution(n)) System.out.println(x+" ");
    }


}
