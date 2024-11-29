package basic.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 전주듣고노래맞히기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] song = br.readLine().split(" ");
            String songName = song[1];
            StringBuilder sb = new StringBuilder();
            for (int j = 2; j < 5; j++) {
                sb.append(song[j]);
            }

            if(map.containsKey(sb.toString())){
                map.put(sb.toString(), "?");
            } else{
                map.put(sb.toString(), songName);
            }
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String[] umInput = br.readLine().split(" ");
            StringBuilder um = new StringBuilder();
            for (int j = 0; j < 3; j++) {
                um.append(umInput[j]);
            }

            answer.append(map.getOrDefault(um.toString(), "!")).append("\n");
        }

        System.out.println(answer);
    }
}
