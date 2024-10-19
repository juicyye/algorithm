package chap_01;

import java.util.ArrayList;
import java.util.Scanner;

public class 특정문자뒤집기_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int lt = 0, rt = s.length() - 1;

        char[] charArray = s.toCharArray();
        while (lt < rt) {
            if(!Character.isAlphabetic(charArray[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(charArray[rt])) {
                rt--;
            } else{
                char temp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;
                lt++;
                rt--;
            }

        }
        System.out.println(charArray);

    }
}
