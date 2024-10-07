package step1.chap8;

import java.util.Scanner;

public class 진법변환 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        String N = scanner.next();  // B진법 수
        int B = scanner.nextInt();   // 진법 B

        long decimalValue = 0;  // 10진법 값

        // N의 각 자리 계산
        for (int i = 0; i < N.length(); i++) {
            char digit = N.charAt(i); // N의 각 자리

            int value;
            if (digit >= '0' && digit <= '9') {
                value = digit - '0'; // '0'~'9'는 0~9로 변환
            } else {
                value = digit - 'A' + 10; // 'A'~'Z'는 10~35로 변환
            }

            // 자리수에 따라 10진법으로 변환
            decimalValue = decimalValue * B + value;
        }

        // 결과 출력
        System.out.println(decimalValue);

        scanner.close();


    }
}
