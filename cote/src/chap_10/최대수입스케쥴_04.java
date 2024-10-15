package chap_10;

import java.util.*;

public class 최대수입스케쥴_04 {

    static class Lecture implements Comparable<Lecture>{
        private int money;
        private int time;

        public Lecture(int money, int time) {
            this.money = money;
            this.time = time;
        }

        @Override
        public int compareTo(Lecture o) {
            return o.time - this.time;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Lecture> arr = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int d = sc.nextInt();
            arr.add(new Lecture(m, d));
            if(d>max) max = d;
        }

        Collections.sort(arr);
        int answer= 0;
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        int j =0;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if(arr.get(j).time < i) break;
                queue.offer(arr.get(j).money);
            }
            if(!queue.isEmpty()){
                answer += queue.poll();
                queue.clear();
            }

        }

        System.out.println(answer);

    }
}
