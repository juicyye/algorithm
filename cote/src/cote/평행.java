package cote;

public class 평행 {
    public static int solution(int[][] dots) {
        // 기울기 = y1 - y2 / x1 -x2, 기울기가 같으면 평행
        // 1,4
        // 9,2
        // 3,8
        // 11,6
        int answer = 0;
        for (int i = 0; i < dots.length; i++) {
            float temp = parel(dots[i],dots[(i+1)%4]);
            float temp2 = parel(dots[(i+2)%4],dots[(i+3)%4]);
            if (temp == temp2) {
                answer =1;
            }

        }
        return answer;
    }

    public static float parel(int[] a1, int[] a2) {
        float x1,y1;

        x1=a1[0]-a2[0];
        y1=a1[1]-a2[1];
        return y1/x1;

    }
    public static void main(String[] args) {
        int[][] dots = {{1,4},{9,2},{3,8},{11,6}};
        System.out.println("solution(dots) = " + solution(dots));


    }
}
