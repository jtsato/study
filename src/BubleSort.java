import java.util.Arrays;

public class BubleSort {

    public static void main(String[] args) {

        int[] array = {55, 35, 45, 70, 22, 10, 2, 14, 28, 89};
        bubleSort(array);
        System.out.println(Arrays.toString(array));

        int[] array2 = {55, 35, 45, 70, 22, 10, 2, 14, 28, 89};
        insertionSort(array2);
        System.out.println(Arrays.toString(array2));
    }

    private static void bubleSort(int[] array) {

        // from back to front
        for (int index = array.length - 1; index > 0; index--) {
            for (int index2 = 0; index2 < index; index2++) {
                if (array[index2] > array[index2 + 1]) {
                    swap(array, index2, index2 + 1);
                }
            }
        }

        // from front to back
        for (int index = 0; index < array.length - 1; index++) {
            for (int index2 = 1; index2 < array.length - index; index2++) {
                if (array[index2 - 1] > array[index2]) {
                    swap(array, index2 - 1, index2);
                }
            }
        }
    }

    private static void swap(int[] array, int j, int right) {
        int temp = array[j];
        array[j] = array[right];
        array[right] = temp;
    }

    public static void insertionSort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int element = array[j];
            System.out.println("Element: " + element);
            int index;
            for (index = j - 1; (index >= 0) && (array[index] > element); index--) {
                System.out.println("index + 1: " + array[index+1] + ", index: " + array[index]);
                array[index + 1] = array[index];
            }
            array[index + 1] = element;
        }
    }
}
