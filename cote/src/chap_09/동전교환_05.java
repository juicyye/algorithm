package chap_09;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 동전교환_05 {
    private static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        int value = sc.nextInt();
        dfs(0,0,value,arr);
        System.out.println(answer);

    }

    public static void dfs(int l, int sum, int value, Integer[] arr) {
        if(sum > value) return;
        if(l>=answer) return;
        if (sum == value) {
            answer = Math.min(answer, l);

        } else{
            for (int i : arr) {
                dfs(l + 1, sum + i, value, arr);
            }
        }

    }
}
