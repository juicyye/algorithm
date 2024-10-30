package chap_04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 아나그램_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        Map<String, Integer> map1 = new HashMap<>();

        String result = "YES";

        for (String s : a.split("")) {
            map1.put(s, map1.getOrDefault(s, 0) + 1);
        }

        for (String s : b.split("")) {
            if (!map1.containsKey(s) || map1.get(s) == 0) {
                result = "NO";
                break;
            }
            map1.put(s, map1.get(s) - 1);
        }

        System.out.println(result);

    }
}
