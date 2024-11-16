package basic.week1;

import java.util.Scanner;

public class 재귀의귀재 {
    private static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            int palindrome = recursion(s.toCharArray(), 0, s.length() - 1);
            System.out.println(palindrome + " " + count);
            count = 0;
        }
    }

    private static int recursion(char[] s, int l, int r) {
        count++;
        if (l >= r) {
            return 1;
        } else if (s[l] != s[r])
            return 0;
        else
            return recursion(s, l + 1, r - 1);
    }

}
