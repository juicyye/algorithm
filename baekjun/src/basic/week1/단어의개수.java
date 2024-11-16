package basic.week1;

import java.util.Scanner;

public class 단어의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(" ");
        int count = 0;
        for (String string : split) {
            if(string.isBlank()) continue;
            count++;
        }
        System.out.println(count);
    }
}
