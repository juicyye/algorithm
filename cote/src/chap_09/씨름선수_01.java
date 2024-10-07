package chap_09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body>{
    public int h,w;
    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        return o.h- this.h;
    }
}
public class 씨름선수_01 {
    public int solution(ArrayList<Body> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for (Body ob : arr) {
            if (ob.w > max) {
                max = ob.w;
                cnt++;
            }
        }
        long[] answer = new long[5];
        for (int i = 0; i < 1000000; i++) {
            //answer.
        }
        return cnt;
    }

    public static void main(String[] args) {
        씨름선수_01 t = new 씨름선수_01();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println("t.solution(arr,n) = " + t.solution(arr, n));
    }
}
