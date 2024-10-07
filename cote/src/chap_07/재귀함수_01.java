package chap_07;

import java.util.Arrays;
import java.util.Scanner;

public class 재귀함수_01 {
    public static void dfs(int n) {
        if (n == 0) {
            return;
        } else {
            dfs(n - 1);
            System.out.println("n = " + n);
        }

    }

    public static void main(String[] args) {
        dfs(3);
    }
}
