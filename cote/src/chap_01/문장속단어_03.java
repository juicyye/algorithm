package chap_01;

import java.util.Scanner;

public class 문장속단어_03 {
    static String solution(String string) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;

        String[] s = string.split(" ");
        for (String s1 : s) {
            int len  = s1.length();
            if (len > m) {
                m = len;
                answer = s1;
            }
        }
        while ((pos = string.indexOf(" ")) != -1) {
            String tmp = string.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            string = string.substring(pos+1);
        }
//        if(string.length()>m) answer = s1;*/
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("solution(s) = " + solution(s));
    }
}
