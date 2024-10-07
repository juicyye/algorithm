package cote;

import java.util.HashSet;
import java.util.Set;

public class 소수찾기Level2 {
    static boolean isPrime(int num){
        if(num<=1) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0) return false;
        }
        return true;
    }

    static int solution(String numbers) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        boolean[] visited = new boolean[numbers.length()];
        makeNumber(set, numbers.toCharArray(), visited, "");
        for (Integer num : set) {
            if (isPrime(num)) {
                answer++;
            }
        }

        return answer;
    }

    private static void makeNumber(Set<Integer> numberSet, char[] numbers, boolean[] visited, String s) {
        for (int i = 0; i < numbers.length; i++) {
            if (!visited[i]) { // false일때 통과
                s += String.valueOf(numbers[i]); // 문자열에 number추가
                visited[i] = true; // 0번째는 햇으니까 true하고
                makeNumber(numberSet, numbers, visited, s); // dfs
                s = s.substring(0, s.length() - 1); // 마지막 문자 제거
                visited[i] = false;
            }else{
                numberSet.add(Integer.parseInt(s));
            }
        }
    }


    public static void main(String[] args) {
        String numbers = "17";
        String numbers2 = "011";

        System.out.println(solution(numbers));
        System.out.println(solution(numbers2));
    }
}
