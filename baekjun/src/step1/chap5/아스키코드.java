package step1.chap5;

import java.util.Scanner;

public class 아스키코드 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (char c : s.toCharArray()) {
            System.out.println((int) c);
        }

    }
}
