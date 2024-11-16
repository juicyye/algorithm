package basic.week1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class 근무지옥에빠진푸앙이 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());

            int[] times = {4, 6, 4, 10};
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 4; j++) {
                    String[] shift = br.readLine().split(" ");
                    for (String name : shift) {
                        if (!name.equals("-")) {
                            map.put(name, map.getOrDefault(name, 0) + times[j]);
                        }
                    }
                }
            }

            if (map.isEmpty()) {
                bw.write("Yes");
                return;
            }

            Integer max = Collections.max(map.values());
            Integer min = Collections.min(map.values());

            bw.write(max - min <= 12 ? "Yes" : "No");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
