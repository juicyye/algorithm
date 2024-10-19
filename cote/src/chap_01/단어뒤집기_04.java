package chap_01;

import java.util.Scanner;

public class 단어뒤집기_04 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            char[] charArray = s.toCharArray();
            int lt = 0, rt = s.length()-1;
            while(lt < rt) {
                char temp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;
                lt++;
                rt--;
            }
            arr[i] = String.valueOf(charArray);
        }
        for (String s : arr) {
            System.out.println(s);
        }

    }

}
