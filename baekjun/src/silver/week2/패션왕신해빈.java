package silver.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 패션왕신해빈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            int clotheQuantity = Integer.parseInt(br.readLine());
            int answer = 1;
            Map<String, Integer> map = new HashMap<>();

            while (clotheQuantity-- > 0) {
                String category = br.readLine().split(" ")[1];
                map.put(category, map.getOrDefault(category, 0) + 1);
            }

            for (Integer value : map.values()) {
                answer *= (value + 1);
            }

            System.out.println(answer - 1);

        }
    }
}
