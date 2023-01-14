import java.lang.reflect.*;
import java.util.*;

public class ArrayPractise {
    private static double average(int[] intArray) {
        int total = 0;
        for(int integer : intArray) {
            total += integer;
        }
        return (double) total / intArray.length;
    }

    private static int countAboveAve(int[] intArray) {
        int count = 0;
        for (int integer: intArray) {
            if(integer > average(intArray)) {
                count++;
            }
        }
        return count;
    }

    private static int largest(int[] intArray) {
        int[] sortedArray = intArray.clone();
        Arrays.sort(sortedArray);
        return sortedArray[sortedArray.length - 1];
    }

    private static int indexOfSmallest(int[] intArray) {
        int[] sortedArray = intArray.clone();
        Arrays.sort(sortedArray);
        return sortedArray[0];
    }


    public static void main(String[] args) {
        System.out.println(average(new int[]{6, 2, 3, 4, 5}));
    }
}
