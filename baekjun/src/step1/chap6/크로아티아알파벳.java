package step1.chap6;

import java.util.Scanner;

public class 크로아티아알파벳 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받기
        String input = sc.nextLine();

        // 크로아티아 알파벳 리스트
        String[] croatianAlphabets = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        // 크로아티아 알파벳을 모두 찾아서 치환
        for (String alphabet : croatianAlphabets) {
            input = input.replace(alphabet, "*");  // 크로아티아 알파벳을 '*'로 치환
        }

        // 치환된 문자열의 길이를 출력
        System.out.println(input.length());

        sc.close();
    }
}
