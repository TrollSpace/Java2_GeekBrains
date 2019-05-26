package Lesson2;

public class Main {
    public static void main(String[] args) {
        int result = 0;
        String[][] x = {{"1", "1", "1", "g"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        try {
            try {
                result = sumArray(x);
            } catch (MyArraySizeException e) {
                System.out.println("Size array error!");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Error in: row-" + e.i + ", column-" + e.j + ". Unrecognized symbol: " + x[e.i][e.j]);
        }
        System.out.println(result);
    }


    public static int sumArray(String[][] array) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < 4; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < 4; j++) {
                int s = 0;
                try {
                    s = Integer.parseInt(array[i][j]);
                } catch (RuntimeException e) {
                    throw new MyArrayDataException(i, j);
                }
                sum += s;
            }

        }
        return sum;
    }
}

