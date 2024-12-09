package silver.week3;

import java.util.Scanner;

public class 나무자르기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int maxHeight = 0;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            maxHeight = Math.max(maxHeight, arr[i]);
        }
        int result = binarySearch(arr, maxHeight, m);
        System.out.println(result);

    }

    public static int binarySearch(int[] arr, int maxHeight, int target) {
        int answer = 0;
        int lt = 0;
        int rt = maxHeight;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            long sum = 0;
            for (int height : arr) {
                if (height > mid) {
                    sum += height - mid;
                }
            }

            if (sum >= target) {
                answer = mid;
                lt = mid + 1;
            } else{
                rt = mid - 1;
            }
        }
        return answer;
    }


}
