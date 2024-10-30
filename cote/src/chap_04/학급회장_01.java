package chap_04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 학급회장_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();

        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        String result = "";

        for (String s : str.split("")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
            if (map.get(s) > max) {
                result = s;
                max = map.get(s);
            }
        }

        System.out.println(result);
    }
}
