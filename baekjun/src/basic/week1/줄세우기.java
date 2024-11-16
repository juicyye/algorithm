package basic.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 줄세우기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] moves = new int[s];

        for (int i = 0; i < s; i++) {
            moves[i] = sc.nextInt();
        }

        List<Integer> line = new ArrayList<>();


        for (int i = 0; i < s; i++) {
            int position = i - moves[i];
            line.add(position, i + 1);
        }


        for (int student : line) {
            System.out.print(student + " ");
        }

    }
}
