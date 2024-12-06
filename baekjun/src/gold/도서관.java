package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 도서관 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> negative = new ArrayList<>();
        List<Integer> positive = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            if (number > 0) {
                positive.add(number);
            } else negative.add(Math.abs(number));
        }

        Collections.sort(negative, Collections.reverseOrder());
        Collections.sort(positive, Collections.reverseOrder());

        int answer = 0;
        int maxDistance = 0;
        for (int i = 0; i < negative.size(); i+=m) {
            answer += negative.get(i) * 2;
            maxDistance = Math.max(maxDistance, negative.get(i));
        }

        for (int i = 0; i < positive.size(); i+=m) {
            answer += positive.get(i) * 2;
            maxDistance = Math.max(maxDistance, positive.get(i));
        }

        answer -= maxDistance;
        System.out.println(answer);

    }
}
