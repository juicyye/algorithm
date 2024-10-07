package step2.chap12;

import java.util.Scanner;

public class 블랙잭 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = 0;

        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < a-2; i++) {
            for (int j = i+1; j < a-1; j++) {
                for (int k = j+1; k < a; k++) {
                    int check = arr[i] + arr[j] + arr[k];
                    if (check == b) {
                        max = b;
                        break;
                    } else if (check < b - 1) {
                        if(max < check) {
                            max = check;
                        }
                    }
                }

            }
        }

        System.out.println(max);
    }
}
