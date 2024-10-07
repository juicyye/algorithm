package step1.chap6;

import java.util.HashSet;
import java.util.Scanner;

public class 그룹단어체커 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String i = scanner.nextLine();
        int result = 0;

        for (int j = 0; j < Integer.parseInt(i); j++) {
            String s = scanner.nextLine();

            if (check(s)) {
                result++;
            }
        }
        System.out.print(result);

    }

    private static boolean check(String word) {
        HashSet<Character> seen = new HashSet<>();  // 등장한 문자를 기록할 집합
        char prev = '\0';  // 이전 문자를 저장할 변수

        // 단어의 각 문자를 탐색
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);

            // 현재 문자가 이전 문자와 다르다면
            if (current != prev) {
                // 이미 등장했던 문자라면 그룹 단어가 아님
                if (seen.contains(current)) {
                    return false;
                }
                // 새로운 문자라면 집합에 추가
                seen.add(current);
            }

            // 이전 문자 갱신
            prev = current;
        }

        // 모든 문자를 통과했다면 그룹 단어임
        return true;
    }


}
