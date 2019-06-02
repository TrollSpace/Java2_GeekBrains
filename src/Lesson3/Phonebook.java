package Lesson3;

import java.util.HashMap;
import java.util.Map;

public class Phonebook extends HashMap {
    private Map<Integer, String> phonebook;

    public void add(int phone, String surname) {
        phonebook.put(phone, surname);
    }

    public void get(String surname) {
        for (Map.Entry<Integer, String> tmp : phonebook.entrySet()) {
            System.out.println("Найденые номера для фамилии " + surname + ": ");
            if (tmp.getValue().equals(surname)) {
                System.out.println(tmp.getKey());
            } else {
                System.out.println("Null");
            }
        }
    }

}
