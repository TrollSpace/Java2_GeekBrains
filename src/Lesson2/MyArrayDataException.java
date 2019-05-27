package Lesson2;

public class MyArrayDataException extends RuntimeException {
    private int i;
    private int j;

    public int getI() {
        return i;
    }


    public int getJ() {
        return j;
    }

    public MyArrayDataException(int i, int j, String[][] array){
        super("Error in: row-" + i + ", column-" + j + ". Unrecognized symbol: " + array[i][j]);
    }
}
