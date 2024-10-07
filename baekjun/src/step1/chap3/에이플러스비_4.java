package step1.chap3;

import java.util.Scanner;

public class 에이플러스비_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {  // EOF를 만나면 자동으로 종료
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }
    }
}
