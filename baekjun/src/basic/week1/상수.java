package basic.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 상수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = s.split(" ");
        String a = split[0];
        String b = split[1];

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for(int i = 2; i >= 0; i--) {
            sb1.append(a.charAt(i));
            sb2.append(b.charAt(i));
        }

        System.out.println(Math.max(Integer.parseInt(sb1.toString()), Integer.parseInt(sb2.toString())));
    }
}
