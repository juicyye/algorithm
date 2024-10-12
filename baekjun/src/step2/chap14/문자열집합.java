package step2.chap14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class 문자열집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        List<String> s = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            s.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            String s1 = br.readLine();
            if(s.contains(s1)) {
                count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
        br.close();


    }
}
