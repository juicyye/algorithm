package chap_01;

import java.util.Scanner;

public class 암호_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String ascii = str.substring(0, 7).replace("#","1").replace("*","0");
            sb.append(((char) Integer.parseInt(ascii,2)));
            str = str.substring(7);
        }

        System.out.println(sb);



    }
}
