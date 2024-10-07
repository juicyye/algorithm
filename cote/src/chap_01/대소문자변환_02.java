package chap_01;

import java.util.Scanner;

public class 대소문자변환_02 {
    static String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer +=Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }
          for (char x : str.toCharArray()) {
            if (x>=97 && x<=122) answer+=(char)(x-32);
             else answer+=(char)(x+32);
        }
        return answer;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("solution(s) = " + solution(s));
    }
}
