package chap_01;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기_04 {
    static ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);

        }

        for (String x : str) {
            char[] s =x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;

            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String str[] = new String[i];
        for (int j = 0; j < i; j++) {
            str[j] = scanner.nextLine();
        }
        for (String x : solution(i, str)) {
            System.out.println("x = " + x);
        }
    }

}
