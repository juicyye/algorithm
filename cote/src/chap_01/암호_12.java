package chap_01;

import java.util.Scanner;

public class 암호_12 {
    static String solution(int n,String str) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = str.substring(0, 7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(tmp,2);
            answer+=(char) num;
            str = str.substring(7);
        }

        return answer;




    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.nextLine();
        System.out.println("solution(n, str) = " + solution(n, str));

        String s= "hello";

    }
}
