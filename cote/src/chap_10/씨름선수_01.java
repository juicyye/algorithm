package chap_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class 씨름선수_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println("solution(arr,n) = " + solution(arr));
    }

    public static int solution(List<Body> arr) {
        int cnt = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for (Body ob : arr) {
            if (ob.w > max) {
                max = ob.w;
                cnt++;
            }
        }

        return cnt;
    }

    static class Body implements Comparable<Body>{
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


}
