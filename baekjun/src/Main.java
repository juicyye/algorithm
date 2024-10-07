import java.util.*;
import java.lang.*;
import java.io.*;

/*
    N 장의 카드 중 3 장을 고르고, M 을 넘지 않으면서 M 과 최대한 가깝게 만들기
    개수는 정해져있고 순서는 중요하지 않으니까 조합
*/

class Main {
    static int N, M, cards[], result;

    static void comb(int cnt, int start, int sum) {
        if(sum > M) return;
        if(cnt == 3) {
            result = Math.max(result, sum);
            return;
        }
        for(int i = start; i < N; i++) {
            comb(cnt +1, i+1, sum + cards[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        cards = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        result = 0;
        comb(0, 0, 0);

        System.out.println(result);
    }
}