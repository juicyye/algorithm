package step1.chap7;

import java.util.Scanner;

public class 도화지 {
    public static void main(String[] args) {
        // 가로, 세로크기가 각각 100인 정사각형 흰색 도화지가 있다
        // 이 도화지 위에 가로,세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지 변이 평행하도록 붙인다
        // 이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 구하시오
        // 첫번째로 주어지는 자연수는 색종이의 왼쪽변과 도화지의 왼쪽변 사이의 거리이고
        // 두번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] rec = new int[100][100];
        int count =0;


        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            for (int j = a; j < a+10; j++) {
                for (int k = b; k < b+10; k++) {
                    if (rec[j][k] == 1) {
                        continue;
                    }
                    rec[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j <100; j++) {
                if(rec[i][j] == 1){
                    count++;
                }
            }
        }

        System.out.print(count);



    }
}
