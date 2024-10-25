package chap_03;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class 교집합_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> set1 = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set1.add(scanner.nextInt()) ;
        }

        int m = scanner.nextInt();
        Set<Integer> set2 = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            set2.add(scanner.nextInt());
        }

        set1.retainAll(set2);

        for (Integer i : set1) {
            System.out.print(i+ " ");
        }

    }
}
