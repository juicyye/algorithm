package gold;

import java.util.Arrays;
import java.util.Scanner;

public class 좋다 {

    private static int n;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if(solution(i)) answer++;
        }
        System.out.println(answer);
    }

    private static boolean solution(int targetIndex) {
        int lt = 0, rt = n - 1;
        int target = arr[targetIndex];

        while (lt < rt) {
            if(lt == targetIndex){
                lt++;
                continue;
            }

            if(rt == targetIndex){
                rt--;
                continue;
            }

            int sum = arr[lt] + arr[rt];
            if(sum == target){
                return true;
            } else if(sum < target) {
                lt++;
            } else{
                rt--;
            }
        }
        return false;
    }


}
