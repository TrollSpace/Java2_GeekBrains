package Lesson2;

public class MyArrayDataException extends RuntimeException {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    private int j;

    public MyArrayDataException(int i, int j){
        this.i = i;
        this.j = j;
    }
}
