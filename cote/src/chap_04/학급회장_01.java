package chap_04;

import java.util.HashMap;
import java.util.Scanner;

public class 학급회장_01 {
    static char solution(int n, String str) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        for (Character c : map.keySet()) {
            if (map.get(c) > max) {
                max = map.get(c);
                answer = c;
            }
        }


        return answer;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //
        String str = scanner.nextLine();
        System.out.println("solution(n,k,arr) = " + solution(n,str));

    }
}
