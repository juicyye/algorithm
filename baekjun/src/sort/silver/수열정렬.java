package sort.silver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 수열정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] p = new int[n];

        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(new int[]{num, i});
        }

        list.sort((x,y) -> x[0] - y[0]);

        for (int i = 0; i < n; i++) {
            int originalIndex = list.get(i)[1];
            p[originalIndex] = i;
        }

        for (int i : p) {
            System.out.print(i + " ");
        }
    }
}
