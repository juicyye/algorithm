package step1.chap9;

import java.util.Scanner;

public class 배수와약수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 0 && b == 0) break;
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            int fac = max / min;
            if(a % b == 0){
                System.out.println("multiple");
            } else if(fac * min == max){
                System.out.println("factor");
            } else{
                System.out.println("neither");
            }

        }
    }
}
