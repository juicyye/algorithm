package basic.week1;

import java.util.Scanner;

public class 뜨거운붕어빵 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n <= 0 || m <= 0) {
            return;
        }

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }
        int column = m - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][column-j];
                arr[i][column-j] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
