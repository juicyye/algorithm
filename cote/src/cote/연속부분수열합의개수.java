package cote;

import java.util.HashSet;
import java.util.Set;

public class 연속부분수열합의개수 {
    static int solution(int[] elements) {
        int answer = 0;

        Set<Integer> set = new HashSet<Integer>();


        for(int i =1; i<=elements.length; i++) // 부분 수열의 길이, 연속된 수열의 길이 1부터 el길이까지니까
        {
            for(int j =0; j<=elements.length; j++) // 시작인덱스를 결정
            {
                int sum =0;
                for(int k=j; k<j+i; k++) //  현재 부분 수열의 인덱스
                {
                    sum+=elements[k%elements.length]; // 나머지를 구하는 거니까 한바퀴를 돌아서 제자리를 확인
                }
                set.add(sum);
            }
        }
        answer = set.size();
        return answer;
    }

    public static void main(String[] args) {
        int[] elements = {7, 9, 1, 1, 4};

    }
}
