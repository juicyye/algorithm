package etc.이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 수찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] m2 = new int[m];
        for (int i = 0; i < m; i++) {
            m2[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i : m2) {
            if (binarySearch(arr, i)) {
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }

    public static boolean binarySearch(int[] arr, int target) {
        int lt = 0, rt = arr.length - 1;
        while (lt <= rt) {
            int mid = (lt +rt)/2;
            if (arr[mid] == target) {
                return true;

            } else if (arr[mid] < target) {
                lt = mid + 1;
            } else rt = mid - 1;
        }
        return false;
    }
}
