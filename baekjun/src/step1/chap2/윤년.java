package step1.chap2;

import java.util.Scanner;

public class 윤년 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if ((a % 4 == 0 && !(a % 100 == 0)) || (a % 400 == 0)) {
            System.out.println(1);
        } else{
            System.out.println(0);
        }

    }
}
