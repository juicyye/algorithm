package step2.chap12;

import java.util.Scanner;

public class 설탕배달 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(get(n));

    }

    public static int get(int n) {

        if (n % 5 == 0) {
            return n / 5;
        }

        int count = 0;
        while (n > 0) {
            if (n % 5 == 0) {
                return count + (n / 5);
            }
            n-=3;
            count++;

            if (n == 0) {
                return count;
            }
            if (n < 0) {
                return -1;
            }
        }
        return -1;

    }


}
