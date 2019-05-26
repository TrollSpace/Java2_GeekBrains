package Lesson2;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void sumArray() {
        String[][] x = {{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        int actual = Main.sumArray(x);
        assertEquals(40,actual);

    }
}
