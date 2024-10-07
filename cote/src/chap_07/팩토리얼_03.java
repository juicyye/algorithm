package chap_07;

import java.util.Scanner;

public class 팩토리얼_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(dfs(i));


    }

    public static int dfs(int n) {
        if(n==1)return 1;
        return n * dfs(n-1);
    }
}
