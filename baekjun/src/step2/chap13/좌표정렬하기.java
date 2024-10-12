package step2.chap13;

import java.util.*;

public class 좌표정렬하기 {
    static class Pointer implements Comparable<Pointer> {
        int x;
        int y;

        public Pointer(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Pointer o) {
            return (this.x != o.x) ? Integer.compare(this.x, o.x) : Integer.compare(this.y, o.y);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Pointer> list = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(new Pointer(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(list);

        for (Pointer pointer : list) {
            System.out.print(pointer.x + " " + pointer.y);
            System.out.println();
        }

    }
}
