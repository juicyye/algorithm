package step1.chap3;

import java.util.Scanner;

public class 코딩은체육과목 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int result = a / 4;
        String repeat = "long ".repeat(result);
        StringBuilder sb = new StringBuilder(repeat + "int");
        System.out.println(sb);
    }
}
