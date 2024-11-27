package gold;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class 아즈버의이빨자국 {
    private static List<Integer> even = new ArrayList<>();
    private static List<Integer> odd = new ArrayList<>();
    private static int[] arr;
    private static int n;
    Set<Integer> answer = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x;
            if (i % 2 == 0) {
                even.add(x);
            }
            if (i % 2 == 1) {
                odd.add(x);
            }
        }


    }

    private static void tonari(){

    }

    private static void evenNumber(){

    }
}
