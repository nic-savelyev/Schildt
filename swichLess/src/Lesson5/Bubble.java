package Lesson5;

public class Bubble {

    private final int arraySize = 10;

    int array[] = { 99, -10, 100123, 18, -978, 5623, 263, 9, 287, 49 };

    void outArray() {
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
    }

    void sortArray() {
        int temp;

        for (int a = 1; a < arraySize; a++) {
            for (int b = arraySize - 1; b >= a; b--) {
                if (array[b - 1] > array [b]) {
                    temp = array [b - 1];
                    array [b - 1] = array [b];
                    array [b] = temp;
                }
            }
        }
    }
}
