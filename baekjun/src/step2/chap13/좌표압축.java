package step2.chap13;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class 좌표압축 {

    public static void main(String[] args) throws IOException {
        // xi를 좌표 압축한것을 xai라고 한다
        // xai는 xi>xj를 만족하는 서로 다른 좌표 xj의 개수와 같아야 한다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Set<Integer> set = new TreeSet<>();

        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(inputs[i]);
            arr[i] = a;
            set.add(a);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (Integer integer : set) {
            map.put(integer, count++);
        }


        for (int i : arr) {
            bw.write(map.get(i)+ " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
