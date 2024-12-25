import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 8, 1, 2};
        sort(intArray);
        System.out.println("Отсортированный массив целых чисел: " + Arrays.toString(intArray));

        Double[] doubleArray = {1.1, 5.5, 8.2, 9.4, 10.7};
        sort(doubleArray);
        System.out.println("Отсортированный массив чисел типа double" + Arrays.toString(doubleArray));

        Character[] charsArray = {'c', 'd', 'a', 'b', 'w'};
        sort(charsArray);
        System.out.println("Отсортированный массив символов" + Arrays.toString(charsArray));

        String[] stringArray = {"кошка", "собака", "велосипед", "курица"};
        sort(stringArray);
        System.out.println("Отсортированный массив строк: " + Arrays.toString(stringArray));
    }

    public static <T extends Comparable<T>> void sort(T[] array) {
        Arrays.sort(array);
    }
}