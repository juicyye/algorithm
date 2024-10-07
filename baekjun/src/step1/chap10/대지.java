package step1.chap10;

import java.util.Scanner;

public class 대지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = Integer.MAX_VALUE;
        int x2 = Integer.MIN_VALUE;
        int y1 = Integer.MAX_VALUE;
        int y2 = Integer.MIN_VALUE;

        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x1 > x) {
                x1 = x;
            }
            if (x2 < x) {
                x2 = x;
            }
            if (y < y1) {
                y1 = y;
            }
            if (y > y2) {
                y2 = y;
            }
        }


        if (a >= 2) {
            System.out.println((x2 - x1) * (y2 - y1));
        } else{
            System.out.println(0);
        }
    }


}
