package chap_07;

import java.util.Scanner;

public class 부분집합구하기_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] ch = new int[i+1];
        dfs(ch,i, 1);
    }

    public static void dfs(int[] ch, int n, int l) {
        if (l == n+1) {
            String temp ="";
            for (int i = 1; i <= n; i++) {
                if(ch[i] == 1) temp += (i + " ");
            }
            if(temp.length() >0 ) System.out.println(temp);

        }  else{
            ch[l]= 1;
            dfs(ch,n,l + 1);
            ch[l]= 0;
            dfs(ch,n,l + 1);
        }

    }

}

