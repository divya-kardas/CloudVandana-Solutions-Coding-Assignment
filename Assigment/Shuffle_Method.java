// 1.JAVA A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

package Assigment;

import java.util.Arrays;

public class Shuffle_Method {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        shuffle(array);
        System.out.println(Arrays.toString(array));
    }

    public static void shuffle(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}