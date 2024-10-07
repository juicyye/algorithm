package step1.chap4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class 최댓값 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Integer> integers = new LinkedList<>();

        for (int i = 0; i < 9; i++) {
            int b = scanner.nextInt();
            integers.add(b);
        }
        Integer max = Collections.max(integers);
        int row = integers.indexOf(max);

        System.out.println(max);
        System.out.println(row+1);
    }
}
