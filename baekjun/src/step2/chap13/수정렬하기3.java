package step2.chap13;

import java.io.*;
import java.util.Arrays;

public class 수정렬하기3 {
    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받기 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 빠르게 하기 위해 BufferedWriter 사용
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 줄에서 수의 개수 N을 입력 받음
        int n = Integer.parseInt(br.readLine());

        // N개의 수를 저장할 배열 생성
        int[] arr = new int[n];

        // N개의 수 입력 받음
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 배열을 오름차순으로 정렬
        Arrays.sort(arr);

        // 정렬된 배열을 BufferedWriter로 출력
        for (int i = 0; i < n; i++) {
            bw.write(arr[i] + "\n");
        }

        // BufferedWriter 닫기 (출력 플러시)
        bw.flush();
        bw.close();
    }
}
