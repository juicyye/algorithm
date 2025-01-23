package binarysearch.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int target = Integer.parseInt(br.readLine());

        System.out.println(solution(arr,target));
    }

    private static int solution(int[] arr, int target){
        int lt = 0;
        int rt = Arrays.stream(arr).max().getAsInt();
        int answer = 0;

        while(lt <= rt){
            int mid = (lt + rt) / 2;

            if (target >= sum(arr, mid)) {
                answer = mid;
                lt = mid+1;
            } else rt = mid -1;

        }
        return answer;
    }

    private static int sum(int[] arr, int max){
        int sum = 0;
        for (int n : arr) {
            if(n >= max) n = max;
            sum += n;
        }
        return sum;
    }
}
