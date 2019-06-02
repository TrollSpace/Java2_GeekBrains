package Lesson2;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void testCorrect() {
        String[][] x = {{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        int actual = Main.sumArray(x);
        assertEquals(40,actual);

    }
//    @org.junit.jupiter.api.Test
//    void testInvalidSize() {
//        String[][] x = {{"1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
//        MyArraySizeException exception = assertThrows(MyArraySizeException.class,() -> {
//            Main.sumArray(x);
//        });
//        assertEquals("Invalid array size!",exception.getMessage());
//
//    }

}
