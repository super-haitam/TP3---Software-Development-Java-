package Exercise_3;

public class Main {

    public static void main() {
        int[][] mat = new int[5][];
        int it = 1;

        for (int r = 0; r < 5; ++r) {
            mat[r] = new int[r+1];
            for (int i = 0; i <= r; ++i) mat[r][i] = it++;
        }

        System.out.println("Jagged 2D matrix: {");
        for (int r = 0; r < 5; ++r) {
            System.out.print("\t{ " + mat[r][0]);
            for (int c = 1; c < mat[r].length; ++c) {
                System.out.print(", " + mat[r][c]);
            }
            System.out.println(" },");
        }
        System.out.println(" }");
    }
}
