package chap_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 결혼식_03 {
    static class Time implements Comparable<Time> {
        int time;
        char state;

        public Time(int time, char state) {
            this.time = time;
            this.state = state;
        }

        @Override
        public int compareTo(Time o) {
            return this.time == o.time ? this.state - o.state : this.time - o.time;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Time> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(new Time(a, 's'));
            list.add(new Time(b, 'e'));
        }

        Collections.sort(list);
        int answer = Integer.MIN_VALUE;
        int count = 0;

        for (Time time : list) {
            if(time.state == 's') count++;
            else count--;
            answer = Math.max(answer,count);
        }

    }
}
