package step1.chap4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 최소최대 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            integers.add(b);
        }
        Integer max = Collections.max(integers);
        Integer min = Collections.min(integers);
        System.out.println(min + " " + max);

    }
}
