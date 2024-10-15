package chap_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 회의실배정_02 {
    static class MeetingTime implements Comparable<MeetingTime>{


        int start;
        int end;

        public MeetingTime(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(MeetingTime o) {
            return end != o.end ? Integer.compare(end, o.end) : Integer.compare(start, o.start);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        List<MeetingTime> list = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(new MeetingTime(a, b));
        }

        Collections.sort(list);
        int count = 0;
        int end = 0;

        for (MeetingTime meetingTime : list) {
            if (meetingTime.start >= end) {
                count++;
                end = meetingTime.end;
            }
        }
        System.out.println(count);
    }
}
