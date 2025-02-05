package dp.silver;

import java.util.Scanner;

public class 피보나치함수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] zero = new int[41];
            int[] one = new int[41];

            zero[0] = 1;
            zero[1] = 0;
            one[0] = 0;
            one[1] = 1;

            for(int i = 2; i <= n; i++) {
                zero[i] = zero[i - 2] + zero[i - 1];
                one[i] = one[i - 2] + one[i - 1];
            }

            System.out.println(zero[n] + " " + one[n]);
        }
    }
}
