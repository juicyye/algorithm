package cote;

public class 연속된부분수열합 {
    static int[] solution(int[] sequence, int k) {
        int[] answer= {-1,-1};
        int sum=0, lt=0, rt = 0;
        int minLength = Integer.MAX_VALUE;
        while(true){
            if (k <= sum) {
                if (k == sum && rt - lt < minLength) {
                    minLength = rt-lt;
                    answer[0] = lt;
                    answer[1] = rt-1; // rt가 이미 더해져서 오니까 -1을 해준다
                }
                sum -= sequence[lt++];
            } else{
                if(rt == sequence.length) break;
                sum += sequence[rt++];
            }
        }
        return answer;

        }
    public static void main(String[] args) {
        int[] sequence = {1, 2, 3, 4, 5};
        int k = 7;

        int[] solution = solution(sequence, k);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}
