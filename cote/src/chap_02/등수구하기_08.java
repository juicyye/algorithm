package chap_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 등수구하기_08 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if(arr.get(i) < arr.get(j)) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
