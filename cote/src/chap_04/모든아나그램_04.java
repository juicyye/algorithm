package chap_04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 모든아나그램_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();

        Map<Character, Integer> input = new HashMap<>();
        Map<Character, Integer> ana = new HashMap<>();

        for (Character ch : t.toCharArray()) {
            ana.put(ch, ana.getOrDefault(ch, 0) + 1);
        }

        int length = t.length();

        for (int i = 0; i < length - 1; i++) {
            input.put(s.charAt(i), input.getOrDefault(s.charAt(i), 0) + 1);
        }

        int count = 0, lt = 0;

        for (int rt = length - 1; rt < s.length(); rt++) {
            input.put(s.charAt(rt), input.getOrDefault(s.charAt(rt), 0) + 1);
            if(input.equals(ana)) count++;
            input.put(s.charAt(lt), input.get(s.charAt(lt)) - 1);
            if(input.get(s.charAt(lt)) == 0) input.remove(s.charAt(lt));
            lt++;
        }

        System.out.println(count);
    }
}
