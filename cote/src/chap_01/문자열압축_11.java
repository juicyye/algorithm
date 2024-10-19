package chap_01;

import java.util.Scanner;

public class 문자열압축_11 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine()+" ";
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                sb.append(s.charAt(i));
                if (count > 1) sb.append(count);
                count = 1;
            }
        }

        // 결과 출력
        System.out.println(sb);

    }
}
