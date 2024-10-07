package chap_07;

import com.sun.tools.javac.Main;

public class 피보나치재귀_04 {
    static int[] fibo;

    public static int dfs(int n) {
        if(fibo[n]>0) return fibo[n];
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = dfs(n - 2) + dfs(n - 1);

    }

    public static void main(String[] args) {
        피보나치재귀_04 main = new 피보나치재귀_04();
        int n = 10;
        fibo = new int[n + 1];
        dfs(n);
        for (int i = 1; i <= n; i++) {
            System.out.println(fibo[i] + " ");
        }

    }
}
