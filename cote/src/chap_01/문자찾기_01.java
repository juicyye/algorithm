package chap_01;

import java.util.Scanner;

public class 문자찾기_01 {
    static int solution(String str, char c) {
        int count =0;
        String upperCase = str.toUpperCase();
        char c1 = Character.toUpperCase(c);

        for (char m : upperCase.toCharArray()) {
            if (m == c1) {
                count++;
            }
        }
        for (int i = 0; i <= str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char c = scanner.nextLine().charAt(0);
        System.out.println("solution(s) = " + solution(s,c));
    }
}
