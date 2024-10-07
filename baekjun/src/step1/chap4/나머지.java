package step1.chap4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 나머지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            int b = a % 42;
            set.add(b);
        }
        System.out.println(set.size());
    }
}
