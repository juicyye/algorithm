package step2.chap14;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class 듣보잡 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            set1.add(sc.next());
        }
        for (int i = 0; i < m; i++) {
            String s = sc.next();
            if(set1.contains(s)) set2.add(s);
        }

        System.out.println(set2.size());

        for (String s : set2) {
            System.out.println(s);
        }
    }
}
