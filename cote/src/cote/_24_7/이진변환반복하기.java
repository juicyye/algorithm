package cote._24_7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 이진변환반복하기 {
    public static int[] solution(String s) {
        Queue<String> zeroStorage = new LinkedList<>();
        int temp = 0;
        return recur(s,zeroStorage, temp);

    }
    public static int[] recur(String s,Queue<String> zeroStorage,int temp) {
        int[] answer = new int[2];
        StringBuilder stringBuilder = new StringBuilder();
        if (s.equals("1")) {
            answer[0] = temp;
            answer[1] = zeroStorage.size();
            return answer;
        }

        String[] split = s.split("");
        for (String string : split) {
            if(string.equals("0")) {
                zeroStorage.offer(string);
            } else{
                stringBuilder.append(string);
            }
        }
        String binaryString = Integer.toBinaryString(stringBuilder.length());
        return recur(binaryString,zeroStorage,temp+1);
    }
    public static void main(String[] args) {
        String s = "110010101001";
        String s2 = "01110";

        System.out.println("solution(s) = " + Arrays.toString(solution(s)));
        System.out.println("solution(s) = " + Arrays.toString(solution(s2)));

    }
}
