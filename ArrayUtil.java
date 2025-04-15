package Labs.Lab06;

import java.util.Arrays;

public class ArrayUtil {
    public static void reverse(String[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
    }

    public static String[] resize(String[] array) {
        return Arrays.copyOf(array, array.length * 2);
    }

    public static String[] add(String element, String[] array) {  
        String[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[array.length] = element;
        return newArray;
    }

    public static boolean contains(String element, String[] array) { 
        if (array == null || array.length == 0) {
            return false; 
        }
        for (String str : array) {
            if (str != null && str.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static int findMinValue(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMaxValue(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int findMinIndex(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findMaxIndex(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}