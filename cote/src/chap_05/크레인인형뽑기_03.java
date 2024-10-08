package chap_05;

import java.util.Scanner;
import java.util.Stack;

public class 크레인인형뽑기_03 {
    static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos-1] =0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        answer+= 2;
                        stack.pop();
                    } else stack.push(tmp);
                    break;
                }
            }
        }
        return answer;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        int m = scanner.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = scanner.nextInt();
        }
        System.out.println("s = " + solution(board, moves));

    }
}
