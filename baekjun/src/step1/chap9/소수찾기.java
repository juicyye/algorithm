package step1.chap9;

import java.util.Scanner;

public class 소수찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int i = sc.nextInt();
        for (int j = 0; j < i; j++) {
            int a = sc.nextInt();
            if (countSosu(a)) {
                count++;
            }

        }
        System.out.println(count);

        sc.close();
    }

    public static boolean countSosu(int a) {
        if(a <= 1){
            return false;
        }

        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;

    }
}
