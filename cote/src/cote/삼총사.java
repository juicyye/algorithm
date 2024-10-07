package cote;

import java.util.Arrays;

public class 삼총사 {
    static int solution(int[] number) {
        // 학생 3명의 정수번호를 더했을때 0이 되면 3명을 삼총사라고 한다
        int answer = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                for (int k = j+1; k < number.length; k++) {
                    if(number[i]+number[j]+number[k] == 0) answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] a = {-2, 3, 0, 2, -5};
        int[] b = {-3, -2, -1, 0, 1, 2, 3};

        System.out.println(solution(a));
        System.out.println(solution(b));


    }
}
