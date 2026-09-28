package Exercise_6;

public class Main {
    public static void main() {
        int[] arr1 = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};

        System.out.print("The median of: {");
        System.out.print(arr1[0]);
        for (int i = 1; i < arr1.length; ++i) System.out.print(", " + arr1[i]);
        System.out.println("} is " + median(arr1));

        int[] arr2 = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};

        System.out.print("The median of: {");
        System.out.print(arr2[0]);
        for (int i = 1; i < arr2.length; ++i) System.out.print(", " + arr2[i]);
        System.out.println("} is " + median(arr2));

    }
    public static int median(int[] arr) {
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

        return sorted[sorted.length/2];
    }
}
