package step1.chap5;

import java.util.Scanner;

public class 마법의단어 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(" ");
        int count =0;
        for (String string : split) {
            if (string.isBlank()) continue;
            count++;
        }
        System.out.print(count);
        scanner.close();
    }
}
