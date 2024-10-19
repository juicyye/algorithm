package chap_01;

import java.util.Scanner;

public class 대소문자변환_02 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else{
                sb.append(Character.toUpperCase(c));
            }
        }
        System.out.println(sb);
    }
}
