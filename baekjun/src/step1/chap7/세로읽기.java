package step1.chap7;

import java.util.Scanner;

public class 세로읽기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] data = new String[15][15];
        int max = 0;
        for (int i = 0; i < 5; i++) {
            String a = scanner.nextLine();
            String[] split = a.split("");
            for (int j = 0; j < split.length; j++) {
                data[i][j] = split[j];
                if(max < a.length()) {
                    max = a.length();
                }
            }
        }
        for (int i = 0; i <max; i++) {
            for (int j = 0; j < 5; j++) {
                if(data[j][i] == null) continue;
                System.out.print(data[j][i]);
            }
        }
    }

}
