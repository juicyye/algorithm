package chap_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
    public int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x==o.x) return this.y-o.y;
        else return this.x - o.x;
    }
}

public class 좌표정렬_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for (Point point : arr) {
            System.out.println(point.x + " " + point.y);
        }
    }
}
