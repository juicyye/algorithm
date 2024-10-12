package step2.chap13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 나이순정렬 {

    static class User implements Comparable<User> {

        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(User o) {
            return Integer.compare(this.age, o.age);
        }
    }
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            users.add(new User(sc.nextInt(), sc.next()));
        }

        Collections.sort(users);
        for (User user : users) {
            System.out.println(user.age + " " + user.name);
        }
    }

}
