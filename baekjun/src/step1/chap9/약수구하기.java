package step1.chap9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 약수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            if (a == -1) break;

            int sum = 0;
            List<Integer> divisors = new ArrayList<>();

            // 약수 구하기 (자기 자신은 제외)
            for (int i = 1; i <= a / 2; i++) {
                if (a % i == 0) {
                    sum += i;
                    divisors.add(i);
                }
            }

            if (sum == a) {
                // 완전수일 때 출력
                StringBuilder sb = new StringBuilder();
                sb.append(a).append(" = ");
                for (int i = 0; i < divisors.size(); i++) {
                    sb.append(divisors.get(i));
                    if (i < divisors.size() - 1) {
                        sb.append(" + ");
                    }
                }
                System.out.println(sb);
            } else {
                // 완전수가 아닐 때 출력
                System.out.println(a + " is NOT perfect.");
            }
        }

        sc.close();
    }
}
