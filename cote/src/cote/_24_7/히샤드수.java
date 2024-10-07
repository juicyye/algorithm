package cote._24_7;

public class 히샤드수 {
    public static boolean solution(int x) {
        int temp = 0;
        String[] split = String.valueOf(x).split("");
        for (String s : split) {
            temp += Integer.valueOf(s);
        }
        if (x % temp == 0) {
            return true;
        }
        System.out.println("temp = " + temp);
        return false;
    }
    public static void main(String[] args) {
        int x = 10;
        int x2 = 13;
        System.out.println(solution(x));
        System.out.println(solution(x2));

    }
}
