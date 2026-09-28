package Exercise_7;

public class Main {
    public static void main() {
        int[] a = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};

        System.out.print("The Standard Deviation of: {");
        System.out.print(a[0]);
        for (int i = 1; i < a.length; ++i) System.out.print(", " + a[i]);
        System.out.println("} is " + stdev(a));
    }

    public static double stdev(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; ++i) sum += a[i];

        double avg = (double) sum / a.length;

        double val = 0;
        for (int i = 0; i < a.length; ++i) {
            val += (a[i] - avg) * (a[i] - avg);
        }

        return Math.sqrt(val / (a.length - 1));
    }
}
