package basic.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 세준세비 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            String input = br.readLine();
            if (input.isBlank()) {
                continue;
            }

            int[] sejun = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int[] sebi = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            solution(sejun, sebi);
            t--;
        }
    }

    private static void solution(int[] sejun, int[] sebi) {
        Arrays.sort(sejun);
        Arrays.sort(sebi);

        int i = 0, j = 0;
        while (i < sejun.length && j < sebi.length) {
            if (sejun[i] < sebi[j]) {
                i++;
            } else {
                j++;
            }
        }

        if (i == sejun.length) {
            System.out.println("B");
        } else {
            System.out.println("S");
        }
    }
}
