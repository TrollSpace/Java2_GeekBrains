package Lesson3;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<Integer, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(int phone, String surname) {
        phoneBook.put(phone, surname);
    }

    public void get(String surname) {
        System.out.println("Найденые номера для фамилии " + surname + ": ");
        for (Map.Entry<Integer, String> tmp : phoneBook.entrySet()) {
            if (tmp.getValue().equals(surname)) {
                System.out.println(tmp.getKey());
            }
        }
    }

}
