package basic.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Hashing {
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> map = toMap();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();

        long result = 0;
        long pow = 1;
        for (int i = 0; i < l; i++) {
            result += map.get(input[i]) * pow;
            pow = (pow * 31) % 1234567891;

        }
        System.out.println(result % 1234567891);
    }

    private static Map<Character, Integer> toMap(){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
        map.put('i', 9);
        map.put('j', 10);
        map.put('k', 11);
        map.put('l', 12);
        map.put('m', 13);
        map.put('n', 14);
        map.put('o', 15);
        map.put('p', 16);
        map.put('q', 17);
        map.put('r', 18);
        map.put('s', 19);
        map.put('t', 20);
        map.put('u', 21);
        map.put('v', 22);
        map.put('w', 23);
        map.put('x', 24);
        map.put('y', 25);
        map.put('z', 26);
        return map;
    }
}
