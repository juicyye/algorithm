package chap_01;

import java.util.Scanner;

public class 문장속단어_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int max = 0;
        String answer = "";
        for (String string : s.split(" ")) {
            if(string.length() > max) {
                max = string.length();
                answer = string;
            }
        }
        System.out.println(answer);
    }
}
