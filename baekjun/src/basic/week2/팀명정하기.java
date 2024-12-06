package basic.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class 팀명정하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new PriorityQueue<>();
        Queue<User> scoreStore = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            String[] split = br.readLine().split(" ");
            queue.add(Integer.parseInt(split[1]) % 100);
            scoreStore.add(new User(Integer.parseInt(split[0]), split[2].substring(0, 1)));
        }

        for (int i = 0; i < 3; i++) {
            sb.append(queue.poll());
        }
        sb.append("\n");

        for (int i = 0; i < 3; i++) {
            sb.append(scoreStore.poll().name);
        }

        System.out.println(sb);

    }

    static class User implements Comparable<User> {
        private int score;
        private String name;

        public User(int score, String name) {
            this.score = score;
            this.name = name;
        }

        @Override
        public int compareTo(User o) {
            return o.score - this.score;
        }
    }
}
