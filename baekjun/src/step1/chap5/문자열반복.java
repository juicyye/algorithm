package step1.chap5;

import java.util.Scanner;

public class 문자열반복 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 입력: 테스트 케이스 개수 T
        int T = sc.nextInt();

        // 각 테스트 케이스 처리
        for (int i = 0; i < T; i++) {
            // 반복 횟수 R 입력
            int R = sc.nextInt();
            // 문자열 S 입력
            String S = sc.next();

            // StringBuilder로 결과를 저장할 문자열 생성
            StringBuilder sb = new StringBuilder();

            // 문자열 S의 각 문자를 R번 반복하여 sb에 추가
            for (int j = 0; j < S.length(); j++) {
                char c = S.charAt(j);
                sb.append(String.valueOf(c).repeat(R));
            }

            // 결과 출력
            System.out.println(sb.toString());
        }

        sc.close();
    }
}
