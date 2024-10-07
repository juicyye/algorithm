package chap_04;

import java.util.*;

public class k번째큰수_05 {
    static int solution(int[] arr, int n, int k) {
        int answer = -1;
        int cnt =0;
        TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        for (Integer i : tset) {
            cnt++;
            if(cnt==k) return i;

        }
        return answer;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("solution(arr,n,k) = " + solution(arr,n,k));

    }
}
