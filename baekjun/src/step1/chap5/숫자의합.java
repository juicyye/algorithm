package step1.chap5;

import java.util.Scanner;

public class 숫자의합 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        String[] split = b.split("");
        int sum =0;
        for (int i = 0; i < b.length(); i++) {
            sum += Integer.parseInt(split[i]);
        }
        System.out.println(sum);
    }
}
