package step2.chap12;

import java.util.Scanner;

public class 영화감독숌 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 666;
        int count = 0;

        while (true) {
            if (String.valueOf(num).contains("666")) {
                count++;
            }
            if(count == n) break;
            num++;
        }
        System.out.println(num);
    }
}
