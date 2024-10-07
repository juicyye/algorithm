package step1.chap9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소인수분해 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        bf.close();
        for (int i = 2; i*i<=a; ++i) {
            while(a%i == 0) {
                System.out.println(i);
                a /= i;
            }
        }
        if (a != 1) {
            System.out.println(a);
        }

    }
}
