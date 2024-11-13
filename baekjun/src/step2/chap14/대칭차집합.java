package step2.chap14;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 대칭차집합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }

        Set<Integer> differenceA = new HashSet<>(a);
        differenceA.removeAll(b);


        HashSet<Integer> differenceB = new HashSet<>(b);
        differenceB.removeAll(a);


        System.out.println(differenceB.size() + differenceA.size());


    }
}
