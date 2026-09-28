package Exercise_5;

public class Main {
    public static void main() {
        int[][] A = new int[5][5];
        int[][] B = new int[5][5];

        for (int i = 0; i < A.length; ++i) {
            for (int j = 0; j < A[i].length; ++j) {
                A[i][j] = i + j;
            }
        }

        System.out.print("A: ");
        printMatrix(A);

        for (int i = 0; i < B.length; ++i) {
            for (int j = 0; j < B[i].length; ++j) {
                B[i][j] = i - j;
            }
        }

        System.out.print("B: ");
        printMatrix(B);

        int[][] C = matrixAdd(A, B);

        System.out.print("A + B: ");
        printMatrix(C);

    }

    public static int[][] matrixAdd(int[][] A, int[][] B) {
        int[][] C = new int[A.length][A[0].length];

        for (int i = 0; i < C.length; ++i) {
            for (int j = 0; j < C[i].length; ++j) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        return C;
    }

    static void printMatrix(int[][] mat) {
        System.out.println("{");
        for (int r = 0; r < mat.length; ++r) {
            System.out.print("\t{ " + mat[r][0]);
            for (int c = 1; c < mat[r].length; ++c) {
                System.out.print(", " + mat[r][c]);
            }
            System.out.println("}");
        }
        System.out.println("}");
    }
}
