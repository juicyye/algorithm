package chap_02;

import java.util.Scanner;

public class 가위바위보_03 {
    static String solution(int n, int[] a,int[] b) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if(a[i] == b[i]) answer +="d";
            else if(a[i]==1&b[i]==3) answer +="a";
            else if(a[i]==2 &&b[i]==1)answer +="a";
            else if(a[i]==3 &&b[i]==2)answer +="a";
            else answer+="b";

        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println("solution(n,arr) = " + solution(n, a,b));



    }
}
