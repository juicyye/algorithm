package step1.chap6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 단어공부 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split("");
        Map<String, Integer> map = new HashMap<>();

        int max = 0;
        String maxStr = "?";
        int count = 0;

        for (String string : split) {
            String uc = string.toUpperCase();
            map.put(uc, map.getOrDefault(uc, 0) + 1);
            max = Math.max(max, map.get(uc));
        }

        for (Map.Entry<String, Integer> a : map.entrySet()) {
            if (a.getValue() == max) {
                count++;
                maxStr = a.getKey();
            }
        }

        if (count > 1) {
            System.out.print("?");
        } else{
            System.out.print(maxStr);
        }

    }
}
