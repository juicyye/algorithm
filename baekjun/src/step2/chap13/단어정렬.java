package step2.chap13;

import java.util.*;

public class 단어정렬 {
    static class Word implements Comparable<Word> {
        String word;

        public Word(String word) {
            this.word = word;
        }

        @Override
        public int compareTo(Word o) {
            return this.word.length() != o.word.length() ? Integer.compare(this.word.length(), o.word.length()) : word.compareTo(o.word);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        Set<Word> words = new TreeSet<>();
        for (int j = 0; j < i; j++) {
            words.add(new Word(sc.next()));
        }


        for (Word word : words) {
            System.out.println(word.word);
        }
    }
}
