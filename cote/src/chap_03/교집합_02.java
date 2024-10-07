package chap_03;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class 교집합_02 {
    static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 =0;
        Arrays.sort(a);
        Arrays.sort(b);

        List<Integer> collect = IntStream.range(0, a.length)
                .filter(i -> IntStream.of(b).anyMatch(j -> a[i] == j))
                .mapToObj(i -> a[i])
                .collect(Collectors.toList());

        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            }
            else if (a[p1]>b[p2]) p2++;
            else if (a[p1]<b[p2]) p1++;
        }

        return answer;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        for(int x:solution(n,m,a,b)) System.out.println("x = " + x);

    }
}
