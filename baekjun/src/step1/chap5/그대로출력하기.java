package step1.chap5;

import java.util.Scanner;

public class 그대로출력하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String s = scanner.nextLine();
            System.out.println(s);
        }

        
    }
}
