package step1.chap8;

import java.util.Scanner;

public class 진법변환2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int N = scanner.nextInt();
        int B = scanner.nextInt();

        // 진법 변환 결과를 저장할 StringBuilder
        StringBuilder result = new StringBuilder();

        // B진법으로 변환
        while (N > 0) {
            int remainder = N % B;
            if (remainder < 10) {
                result.append((char) (remainder + '0')); // 숫자 0-9
            } else {
                result.append((char) (remainder - 10 + 'A')); // A-Z
            }
            N /= B;
        }

        // 결과 뒤집어서 출력 (왜냐하면 마지막 자리부터 저장됨)
        System.out.println(result.reverse().toString());

        scanner.close();
    }
}
