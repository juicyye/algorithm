package step1.chap5;

import java.util.Scanner;

public class 알파벳찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        // 알파벳의 위치를 저장할 배열 (-1로 초기화)
        int[] position = new int[26];  // 알파벳 a ~ z는 26글자

        // 처음에 모든 알파벳의 위치를 -1로 설정
        for (int i = 0; i < 26; i++) {
            position[i] = -1;
        }

        // 문자열을 순차적으로 탐색
        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);
            int index = currentChar - 'a';  // 현재 문자의 인덱스를 구함 ('a'는 0번째, 'b'는 1번째, ...)

            // 현재 문자가 처음 등장한 경우에만 위치를 기록
            if (position[index] == -1) {
                position[index] = i;
            }
        }

        // 결과 출력
        for (int i = 0; i < 26; i++) {
            System.out.print(position[i] + " ");
        }

        sc.close();
    }
}
