package step1.chap2;

import java.util.Scanner;

public class 시험성적 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        String result = a>= 90 ? "A" : a >= 80 ? "B" : a >= 70 ? "C" : a >= 60 ? "D" : "F";
        System.out.println(result);
    }




}
