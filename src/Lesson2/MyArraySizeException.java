package Lesson2;

public class MyArraySizeException extends RuntimeException {
    private static String message = "Invalid array size!";

    public MyArraySizeException() {
        super(message);
    }
}
