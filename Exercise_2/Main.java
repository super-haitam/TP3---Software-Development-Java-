package Exercise_2;

public class Main {
    public static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
    }

    public static void reverse(int[] arr) {
        System.out.println("Original array: {");
        for (int i = 0; i < arr.length; ++i) System.out.println("\t" + arr[i]);
        System.out.println("}");

        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; ++i) rev[i] = arr[arr.length - i - 1];

        System.out.println("Reversed array: {");
        for (int i = 0; i < rev.length; ++i) System.out.println("\t" + rev[i]);
        System.out.println("}");
    }
}
