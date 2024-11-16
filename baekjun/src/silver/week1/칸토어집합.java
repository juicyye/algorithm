package silver.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 칸토어집합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            int length = (int) Math.pow(3,n);

            // 초기 문자열
            char[] cantorSet = new char[length];
            Arrays.fill(cantorSet, '-');

            recursion(cantorSet, 0, length);
            System.out.println(new String(cantorSet));
        }

        br.close();
    }

    private static void recursion(char[] arr, int start, int length) {
        if (length <= 1) return;

        // 3등분한 구간의 길이
        int division = length / 3;

        // 가운데 구간을 공백으로 변경
        for (int i = start + division; i < start + 2 * division; i++) {
            arr[i] = ' ';
        }

        // 왼쪽 구간 재귀 호출
        recursion(arr, start, division);
        // 오른쪽 구간 재귀 호출
        recursion(arr, start + 2 * division, division);
    }
}
