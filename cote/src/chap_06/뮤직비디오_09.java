package chap_06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 뮤직비디오_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid=(lt+rt)/2;
            if (count(arr, mid) <= m) {
                answer = mid;
                rt=mid-1;
            } else lt=mid+1;
        }
        System.out.println(answer);

    }

    public static int count(int[] arr, int capacity) {
        int count = 1, sum =0;

        for (int x : arr) {
            if (sum + x > capacity) {
                count++;
                sum=x;
            } else sum+=x;
        }
        return count;

    }
}
