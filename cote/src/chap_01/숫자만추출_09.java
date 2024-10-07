package chap_01;

import java.util.Scanner;

public class 숫자만추출_09 {
    static String solution(String str) {
        int answer = 0;
        for (char x : str.toCharArray()) {
            if (x >= 48 && x <= 57) {
                answer= answer * 10 +(x-48);
            }
        }
        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)) answer +=c;
        }
        // return Integer.parseInt(answer);
        return null;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("solution(s) = " + solution(s));

    }
}
