package step1.chap10;

import java.util.Scanner;

public class 삼각형과세변 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 세 각을 입력받음
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a == 0 && b == 0 && c == 0) break;

            // 결과를 저장할 변수
            String answer;

            int max = Math.max(a, Math.max(b, c));
            if (max < a + b + c - max) {
                // 조건에 따라 삼각형의 종류를 판단
                if (a == b && b == c && a == c) {
                    answer = "Equilateral";
                } else if (a != b && b != c && a != c) {
                    answer = "Scalene";
                } else {
                    // 각의 합이 180도이고 세 각이 모두 다른 경우 (일반 삼각형)
                    answer = "Isosceles";
                }
            } else{
                answer = "Invalid";
            }

            // 결과 출력
            System.out.println(answer);
        }





        sc.close();

    }
}
