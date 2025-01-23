package binarysearch.silver;

import java.util.Arrays;
import java.util.Scanner;

public class 기타레슨 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr,m));
    }

    private static int solution(int[] arr, int target){
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        int answer = 0;

        while(lt <= rt){
            int mid = (lt + rt) / 2;
            if (target >= count(arr, mid)) {
                answer = mid;
                rt = mid - 1;
            } else{
                lt = mid + 1;
            }
        }
        return answer;
    }

    private static int count(int[] arr, int max){
        int sum = 0;
        int count = 1;
        for (int n : arr) {
            if(sum + n > max){
                count++;
                sum = n;
            } else sum += n;
        }
        return count;
    }
}
