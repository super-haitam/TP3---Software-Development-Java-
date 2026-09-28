package Exercise_1;

import java.util.Arrays;

public class Main {
    public static void main() {
        int[] arr = {106, 26, 81, 5, 15};
        int[] sorted = sortIntegers(arr);
        for (int j = 0; j < 5; ++j) System.out.println(sorted[j]);
    }

    public static void printArray(int[] arr) {
        boolean[] used = new boolean[arr.length];

        for (int j = 0; j < arr.length; ++j) {
            int maxI;
            for (maxI = 0; maxI < arr.length; ++maxI) if (!used[maxI]) break;

            for (int i = 0; i < arr.length; ++i) {
                if (!used[i] && arr[i] > arr[maxI]) {
                    maxI = i;
                }
            }

            used[maxI] = true;
            System.out.println("Element " + j + " contents " + arr[maxI]);
        }
    }

    public static int[] sortIntegers(int[] arr) {
        int[] sorted = new int[arr.length];

        boolean[] used = new boolean[arr.length];

        for (int j = 0; j < arr.length; ++j) {
            int maxI;
            for (maxI = 0; maxI < arr.length; ++maxI) if (!used[maxI]) break;

            for (int i = 0; i < arr.length; ++i) {
                if (!used[i] && arr[i] > arr[maxI]) {
                    maxI = i;
                }
            }

            used[maxI] = true;
            sorted[j] = arr[maxI];
        }

        return sorted;
    }
}
