package etc.이분탐색;

import java.util.Scanner;

public class 나무자르기 {
    public static void main(String[] args) {
        // 입력 처리
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 나무의 수
        int m = sc.nextInt(); // 필요한 나무 길이

        int[] arr = new int[n];
        int maxTreeHeight = 0;

        // 나무 높이 입력
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > maxTreeHeight) {
                maxTreeHeight = arr[i]; // 가장 큰 나무 높이 저장
            }
        }

        // 절단기 높이 이분 탐색
        int result = binarySearch(arr, m, maxTreeHeight);
        System.out.println(result);
    }

    // 이분 탐색 메서드
    public static int binarySearch(int[] arr, int target, int maxTreeHeight) {
        int lt = 0; // 절단기의 최저 높이
        int rt = maxTreeHeight; // 절단기의 최고 높이
        int answer = 0;

        while (lt <= rt) {
            int mid = (lt + rt) / 2; // 절단기의 높이 설정
            long sum = 0; // 자른 나무 길이의 합

            // 현재 절단기 높이에서 잘린 나무 길이의 합을 계산
            for (int height : arr) {
                if (height > mid) {
                    sum += height - mid;
                }
            }

            // 필요한 나무 길이보다 크거나 같으면 절단기 높이를 높임
            if (sum >= target) {
                answer = mid; // 가능한 높이를 저장
                lt = mid + 1;
            } else {
                rt = mid - 1; // 자른 나무 길이가 부족하면 절단기 높이를 낮춤
            }
        }

        return answer;
    }
}