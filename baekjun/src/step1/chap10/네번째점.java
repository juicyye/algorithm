package step1.chap10;

import java.util.*;

public class 네번째점 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> x = new HashMap<>();
        Map<Integer, Integer> y = new HashMap();

        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            x.put(a, x.getOrDefault(a, 0) + 1);
            y.put(b, y.getOrDefault(b, 0) + 1);
        }

        int result = x.entrySet().stream().filter(i -> i.getValue() == 1).mapToInt(i -> i.getKey()).sum();
        int result2 = y.entrySet().stream().filter(i -> i.getValue() == 1).mapToInt(i -> i.getKey()).sum();

        System.out.println(result+" "+result2);


    }

    /*static void solution() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] x = new int[3];
        int[] y = new int[3];
        int tempx = 0;
        int tempy = 0;

        for (int i = 0; i < x.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        if (x[0] == x[1]) tempx = x[2];
        else if (x[0] == x[2]) tempx = x[1];
        else tempx = x[0];

        if (y[0] == y[1]) tempy = y[2];
        else if (y[0] == y[2]) tempy = y[1];
        else tempy = y[0];

        System.out.println(tempx + " " + tempy);
    }*/
}
