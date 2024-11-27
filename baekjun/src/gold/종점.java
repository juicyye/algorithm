package gold;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 종점 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        int n = sc.nextInt();

        List<Event> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            LocalTime startTime = LocalTime.parse(sc.next(), formatter);
            LocalTime endTime = LocalTime.parse(sc.next(), formatter);

            events.add(new Event(startTime, 1));
            events.add(new Event(endTime, -1));
        }

        Collections.sort(events);

        int answer = 0;
        int currentBuses = 0;
        for (Event event : events) {
            currentBuses += event.type;
            answer = Math.max(answer, currentBuses);
        }
        System.out.println(answer);
    }


    static class Event implements Comparable<Event> {
        private LocalTime time;
        private int type;

        public Event(LocalTime time, int type) {
            this.time = time;
            this.type = type;
        }

        @Override
        public int compareTo(Event o) {
            return time == o.time ? Integer.compare(type, o.type) : time.compareTo(o.time);
        }
    }
}
