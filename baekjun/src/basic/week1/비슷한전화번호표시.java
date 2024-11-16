package basic.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 비슷한전화번호표시 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;

        String a = br.readLine();
        String b = br.readLine();
        String[] split = a.split(" ");
        for (String s : split) {
            if (s.startsWith(b) && !s.equals(b)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
