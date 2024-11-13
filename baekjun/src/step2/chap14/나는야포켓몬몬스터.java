package step2.chap14;

import java.util.*;

public class 나는야포켓몬몬스터 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> name = new HashMap<>();
        Map<Integer, String> index = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String pocketmon = sc.nextLine();
            name.put(pocketmon, i);
            index.put(i, pocketmon);
        }


        for (int i = 0; i < m; i++) {
            String quiz = sc.nextLine();
            if(name.containsKey(quiz)) {
                System.out.println(name.get(quiz));
            } else{
                System.out.println(index.get(Integer.parseInt(quiz)));
            }

        }


    }
}
