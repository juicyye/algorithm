package step1.chap8;

import java.util.Scanner;

public class 분수찾기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();  // 입력으로 주어진 X번째 분수
        int diagonal = 1;  // 대각선 번호
        int sum = 0;  // 누적된 분수 개수

        // X번째 분수가 어느 대각선에 있는지 찾기
        while (sum + diagonal < X) {
            sum += diagonal;
            diagonal++;
        }

        // 대각선에서 X번째 분수가 몇 번째인지 구하기
        int offset = X - sum;  // 대각선에서 몇 번째 분수인지

        // 홀수 대각선일 경우 분모가 감소하고, 짝수 대각선일 경우 분자가 감소
        if (diagonal % 2 == 1) {
            // 홀수 대각선: 분자가 감소하고, 분모가 증가
            int numerator = diagonal - offset + 1;  // 분자
            int denominator = offset;  // 분모
            System.out.println(numerator + "/" + denominator);
        } else {
            // 짝수 대각선: 분자가 증가하고, 분모가 감소
            int numerator = offset;  // 분자
            int denominator = diagonal - offset + 1;  // 분모
            System.out.println(numerator + "/" + denominator);
        }

        scanner.close();

    }
}
