package chap_04;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램_02 {
    static String solution(String s1, String s2) {
        String answer = "yes";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for (char x : s2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) {
                return "no";
            }
            map.put(x,map.get(x)-1);
        }



        return answer;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println("solution(n,k,arr) = " + solution(a,b));

    }
}
