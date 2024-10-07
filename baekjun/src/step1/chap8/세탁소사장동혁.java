package step1.chap8;

import java.io.*;

public class 세탁소사장동혁 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine());

        for(int i=0;i<C;i++){
            int money = Integer.parseInt(br.readLine());

            int q = money/25;
            money = money%25;
            int d = money/10;
            money = money%10;
            int n = money/5;
            money = money%5;
            int p = money/1;

            bw.write(q+" "+d+" "+n+" "+p+"\n");
        }

        bw.flush();
        bw.close();

    }
}
