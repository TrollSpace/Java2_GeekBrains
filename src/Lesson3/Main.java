package Lesson3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        UniqWords.fillArray(words);
        System.out.println(words);
        UniqWords.printUniqWord(words);
        UniqWords.printCountWord(words);


    }
}
