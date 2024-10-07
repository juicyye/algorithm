package chap_07;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class 이진수출력_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        dfs(i);


    }

    public static void dfs(int n) {
        if(n == 0) return;
        else{
            dfs(n / 2);
            System.out.print(n%2);
        }
    }
}
