package step1.chap10;

import java.util.Scanner;

public class 삼각형외우기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 세 각을 입력받음
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 세 각의 합을 구함
        int sum = a + b + c;

        // 결과를 저장할 변수
        String answer;

        // 조건에 따라 삼각형의 종류를 판단
        if (a == 60 && b == 60 && c == 60) {
            // 모든 각이 60도인 경우 (정삼각형)
            answer = "Equilateral";
        } else if (sum == 180 && (a == b || b == c || a == c)) {
            // 각의 합이 180도이고 두 각이 같은 경우 (이등변 삼각형)
            answer = "Isosceles";
        } else if (sum == 180 && a != b && b != c && a != c) {
            // 각의 합이 180도이고 세 각이 모두 다른 경우 (일반 삼각형)
            answer = "Scalene";
        } else {
            // 각의 합이 180도가 아닌 경우 (오류)
            answer = "Error";
        }

        // 결과 출력
        System.out.println(answer);

        sc.close();

    }
}
