package bruteforce.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class 체스판다시칠하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = array[0];
        int m = array[1];

        char[][] matrix = new char[n][m];

        for (int i = 0; i < n; i++) {
            matrix[i] = br.readLine().toCharArray();
        }

        System.out.println(solution(n,m,matrix));
    }

    private static int solution(int n, int m, char[][] matrix) {
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                // 흰색으로 시작하는 체스판
                int paintW = getPaintCount(matrix, i, j, 'W');

                // 검은색으로 시작하는 체스판
                int paintB = getPaintCount(matrix, i, j, 'B');

                // 최소 페인트 횟수 갱신
                answer = Math.min(answer, Math.min(paintW, paintB));
            }
        }

        return answer;
    }

    private static int getPaintCount(char[][] matrix, int startX, int startY, char startColor) {
        int count = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // 예상되는 색상 계산
                char expectedColor = ((i + j) % 2 == 0) ? startColor : (startColor == 'W' ? 'B' : 'W');

                // 실제 색상과 다르면 카운트 증가
                if (matrix[startX + i][startY + j] != expectedColor) {
                    count++;
                }
            }
        }

        return count;
    }
}
