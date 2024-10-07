package step1.chap6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 너의평점은 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 학점 등급을 준다 3.0 A+

        // 학점 * 과목 평점


        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        double sum =0.0;
        double result =0;

        for (int i = 0; i < 20; i++) {
            String a = scanner.next();
            double b = scanner.nextDouble();
            String c = scanner.next();
            if(c.equals("P")) continue;
            sum += map.get(c) * b;
            result += b;

        }
        System.out.println(sum/ result);

    }
}
