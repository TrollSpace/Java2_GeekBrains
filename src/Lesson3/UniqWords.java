package Lesson3;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqWords {

    public static List<String> fillArray(List<String> arr) {
        arr.add("1");
        arr.add("3");
        arr.add("2");
        arr.add("6");
        arr.add("3");
        arr.add("2");
        arr.add("3");
        arr.add("10");
        arr.add("9");
        arr.add("2");
        return arr;
    }

    public static void printUniqWord(List<String> arr) {
        Set<String> hashArr = getHashWords(arr);
        for (String s : hashArr) {
            System.out.print(s + "; ");
        }
        System.out.println();
    }

    private static Set<String> getHashWords(List<String> arr) {
        Set<String> hashArr = new LinkedHashSet<>();
        for (String s : arr) {
            hashArr.add(s);
        }
        return hashArr;
    }

    public static void printCountWord(List<String> arr) {
        Set<String> arrWords = getHashWords(arr);
        for (String s : arrWords) {
            int count = 0;
            for (String unsort : arr) {
                if (s.equals(unsort)) {
                    count++;
                }
            }
            System.out.println("Число вхождений: " + s + "-" + count);

        }
    }
}
