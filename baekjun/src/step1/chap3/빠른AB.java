package step1.chap3;

import java.io.*;

public class 빠른AB {

    public static void main(String[] args) throws IOException {
        /*Java를 사용하고 있다면,
         * Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
         * BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < n ; i++ ) {
            String s = br.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);

            bw.write(a + b + "\n");
        }
        bw.flush();
    }

}
