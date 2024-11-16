package basic.week1;

import java.util.Scanner;

public class 세수정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            int current = sc.nextInt();
            arr[i] = current;

            int j = i;
            while (j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
