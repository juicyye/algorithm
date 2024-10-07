package step1.chap4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 평균 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        ArrayList<Integer> integers = new ArrayList<>();
        Double sum = 0.0;

        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            integers.add(b);
        }
        Integer max = Collections.max(integers);
        for (Integer integer : integers) {
               sum += (double) integer / max * 100;
        }

        System.out.println(sum / a);

    }
}
