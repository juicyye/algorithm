package step2.chap14;

import java.util.*;

public class 회사에있는사람 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<String> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String work = sc.next();
            if (work.equals("leave")) {
                set.remove(name);
                continue;
            }
            set.add(name);
        }
        for (String s : set) {
            System.out.println(s);
        }
    }
}
