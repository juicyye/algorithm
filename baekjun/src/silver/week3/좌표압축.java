package silver.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class 좌표압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        Set<Integer> set = new TreeSet<>();

        String[] split = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(split[i]);
            set.add(arr[i]);
        }

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : set) {
            map.put(i, count++);
        }

        for (int i : arr) {
            System.out.print(map.get(i)+" ");
        }
    }
}
