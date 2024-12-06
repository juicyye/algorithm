package silver.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class 신입사원 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            List<User> users = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String[] split = br.readLine().split(" ");
                users.add(new User(Integer.parseInt(split[0]), Integer.parseInt(split[1])));
            }
            System.out.println(solution(users));
        }

    }

    private static int solution(List<User> users) {
        Collections.sort(users);
        int count = 0;
        int interviewGrade = Integer.MAX_VALUE;
        for (User user : users) {
            if(user.interview < interviewGrade) {
                interviewGrade = user.interview;
                count++;
            }
        }
        return count;
    }

    static class User implements Comparable<User>{
        int document;
        int interview;

        public User(int document, int interview) {
            this.document = document;
            this.interview = interview;
        }

        @Override
        public int compareTo(User o) {
            return Integer.compare(document, o.document);
        }
    }
}
