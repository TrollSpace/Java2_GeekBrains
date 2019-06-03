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

        PhoneBook ph = new PhoneBook();
        ph.add(123,"Ivanov");
        ph.add(124,"Petrov");
        ph.add(125,"Sidorov");
        ph.add(126,"Sidorov");
        ph.add(127,"Smirnoff");
        ph.add(128,"Smirnoff");

        ph.get("Smirnoff");
    }
}
