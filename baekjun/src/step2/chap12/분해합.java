package step2.chap12;

import java.util.Scanner;

public class 분해합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i = n - String.valueOf(n).length() * 9; i < n; i++) {
            if(i<0) continue;
            if (sum(i) == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);

    }

    public static int sum(int number) {
        int sum = number;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

}
