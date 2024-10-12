package chap_09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 피자배달거리_15 {
    static int n,m, len, answer = Integer.MAX_VALUE;
    static int[] combi;
    static List<int[]> pz, hs;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        pz = new ArrayList();
        hs = new ArrayList();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = sc.nextInt();
                if(temp == 1) hs.add(new int[]{i,j});
                else if(temp == 2) pz.add(new int[]{i,j});
            }
        }

        len = pz.size();
        combi = new int[m];
        dfs(0,0);
        System.out.println(answer);
    }

    public static void dfs(int l, int s) {
        if (l == m) {
            int sum = 0;
            for (int[] h : hs) {
                int dis = Integer.MAX_VALUE;
                for (int i : combi) {
                    dis= Math.min(dis, Math.abs(h[0] - pz.get(i)[0] + Math.abs(h[1] - pz.get(i)[1])));
                }
                sum += dis;
            }
            answer = Math.min(sum, answer);

        } else{
            for (int i = s; i < len; i++) {
                combi[l] = i;
                dfs(l + 1, i+1);

            }
        }
    }
}
