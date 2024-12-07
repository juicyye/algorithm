package silver.week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 삼십번 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            Integer[] arr = Arrays.stream(br.readLine().split(" "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
            bw.write(solution(arr[0], arr[1]) * 10 + "\n");
        }
        br.close();
        bw.close();
    }

    private static int solution(int a, int b) {
        while (a != b) {
            if (a > b) {
                a /= 2;
            } else {
                b /= 2;
            }
        }
        return a;
    }
}
