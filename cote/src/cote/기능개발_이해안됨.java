package cote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 기능개발_이해안됨 {
    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();

        int deployDay = 0;
        int cnt = 0;

        for (int i = 0; i < progresses.length; i++) {
            // 남은 진도
            int remainProgress = 100 - progresses[i];
            // 남은진도 / 개발속도
            int deploy = remainProgress / speeds[i];
            // 남은진도 와 개발속도의 나머지가 0이 아니면 deploy +1;
            if (remainProgress % speeds[i] != 0) deploy++;
            // deploy가 deployDay보다 크면 deployDay를 deploy로 바꾸고
            if (deployDay < deploy) {
                deployDay = deploy;
                // cnt가 0이 아니면 answerList에 cnt를 저장
                if (cnt != 0) answerList.add(cnt);
                cnt = 1;
            } else {
                // 아니면 cnt+1
                cnt++;
            }
        }
        answerList.add(cnt);

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        // 진도가 100%일때 서비스에 반영
        // 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될수있다
        // 하지만 앞에 있는 기능이 배포될때 함께 배포

        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        System.out.println(Arrays.toString(solution(progresses, speeds)));

    }
}
