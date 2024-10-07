package step1.chap6;

import java.util.Scanner;

public class 킹퀸룩비숍나이트폰 {
    public static void main(String[] args) {
        // 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8
        Scanner scanner = new Scanner(System.in);
        int[] data = {1, 1, 2, 2, 8};
        for (int i = 0; i < 6; i++) {
            int a = scanner.nextInt();

            System.out.print(data[i] -a+" ");
        }
        
    }
}
