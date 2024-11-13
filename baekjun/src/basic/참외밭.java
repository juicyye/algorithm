package basic;

import java.util.Scanner;

public class 참외밭 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int[] directions = new int[6];
        int[] lengths = new int[6];

        for (int i = 0; i < 6; i++) {
            directions[i] = sc.nextInt();
            lengths[i] = sc.nextInt();
        }

        // 큰 직사각형의 가로와 세로 구하기
        int maxWidth = 0, maxHeight = 0, m_w_index = 0, m_h_index = 0;
        for (int i = 0; i < 6; i++) {
            if (directions[i] == 1 || directions[i] == 2) { // 동쪽 또는 서쪽
                if (lengths[i] > maxWidth) {
                    maxWidth = lengths[i];
                    m_w_index = i;
                }
            } else if (directions[i] == 3 || directions[i] == 4) { // 남쪽 또는 북쪽
                if (lengths[i] > maxHeight) {
                    maxHeight = lengths[i];
                    m_h_index = i;
                }
            }
        }

        // 또다른 직사각형의 가로와 세로 구하기
        int anotherWidth = Math.abs(lengths[(m_h_index + 1) % 6] - lengths[(m_h_index + 5) % 6]);
        int anotherHeight = Math.abs(lengths[(m_w_index + 1) % 6] - lengths[(m_w_index + 5) % 6]);

        // 참외밭의 넓이 계산
        int fieldArea = (maxWidth * maxHeight) - (anotherWidth * anotherHeight);

        // 총 참외 개수 계산
        int totalMelons = fieldArea * K;

        System.out.println(totalMelons);
    }
}
