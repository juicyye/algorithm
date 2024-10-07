package cote;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 후보키_이해안됨 {
    public static int solution(String[][] relation) {
        int answer = 0;
        int row = relation.length;
        int col = relation[0].length;

        List<Integer> candidateKeys = new ArrayList<>();

        // 가능한 모든 속성 조합을 생성하여 후보 키인지를 검사
        for (int i = 1; i < Math.pow(2,col); i++) {
            Set<String> set = new HashSet<>();
            for (int j = 0; j < row; j++) {
                StringBuilder key = new StringBuilder();
                for (int k = 0; k < col; k++) {
                    // 해당 속성이 선택된 경우에만 key에 추가
                    if (((int)(i / Math.pow(2, k))) % 2 == 1) {
                        key.append(relation[j][k]).append(" ");
                    }
                }
                set.add(key.toString());
            }

            // 유일성 확인
            if (set.size() == row) {
                // 최소성 확인
                boolean isMinimal = true;
                for (int key : candidateKeys) {
                    // 현재 후보 키에 속성이 포함되어 있는지 확인
                    if ((key & i) == key) {
                        isMinimal = false;
                        break;
                    }
                }
                // 최소성을 만족하는 경우에만 후보 키로 추가
                if (isMinimal) {
                    candidateKeys.add(i);
                    answer++;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {

        String[][] relation = {
                {"100", "ryan", "music", "2"},
                {"200", "apeach", "math", "2"},
                {"300", "tube", "computer", "3"},
                {"400", "con", "computer", "4"},
                {"500", "muzi", "music", "3"},
                {"600", "apeach", "music", "2"}
        };

        System.out.println(solution(relation));

    }
}
