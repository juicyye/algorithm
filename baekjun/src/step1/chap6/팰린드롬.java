package step1.chap6;

import java.util.Scanner;

public class 팰린드롬 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split("");
        int l = s.length();
        int count = 0;
        for (int i = 0; i < l / 2 + 1; i++) {
            if (split[i].equals(split[l - i -1])) {
                count++;
            }
        }
        System.out.println("count = " + count);

        if(count == l/2 +1) System.out.print(1);
        else System.out.print(0);

    }
}
