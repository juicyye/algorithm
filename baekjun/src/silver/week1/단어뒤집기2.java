package silver.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 단어뒤집기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();


        Pattern pattern = Pattern.compile("(<[^>]+>|\\w+|\\s+)");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String token = matcher.group();
            if (token.startsWith("<")) {
                sb.append(token);
            } else if (token.matches("\\s+")) {
                sb.append(token);
            } else {
                sb.append(new StringBuilder(token).reverse());
            }
        }
        System.out.println(sb);
    }
}
