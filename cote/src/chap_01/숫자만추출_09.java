package chap_01;

import java.util.Scanner;

public class 숫자만추출_09 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(Character.isDigit(c)) sb.append(c);
        }
        System.out.println(Integer.parseInt(sb.toString()));

    }
}
