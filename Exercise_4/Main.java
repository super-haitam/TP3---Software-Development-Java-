package Exercise_4;

public class Main {
    public static void main() {
        int[][] mat = new int[6][8];
        for (int r = 0; r < 6; ++r) {
            for (int c = 0; c < 8; ++c) {
                mat[r][c] = r + c;
            }
        }

        System.out.print("Original Matrix: {\n\t ");

        for (int i = 0; i < 8; ++i) {
            if (i + 1 == 2 || i + 1 == 5) { System.out.print("|" + (i+1) + "|");
            } else { System.out.print("   "); }
        }
        System.out.println();

        for (int r = 0; r < 6; ++r) {
            System.out.print("\t{ " + mat[r][0]);
            for (int c = 1; c < 8; ++c) {
                System.out.print(", " + mat[r][c]);
            }
            System.out.println("}");
        }
        System.out.println("}");

        copy2To5(mat);

        System.out.print("Updated Matrix: {\n\t ");

        for (int i = 0; i < 8; ++i) {
            if (i + 1 == 2 || i + 1 == 5) { System.out.print("|" + (i+1) + "|");
            } else { System.out.print("   "); }
        }
        System.out.println();

        for (int r = 0; r < 6; ++r) {
            System.out.print("\t{ " + mat[r][0]);
            for (int c = 1; c < 8; ++c) {
                System.out.print(", " + mat[r][c]);
            }
            System.out.println("}");
        }

        System.out.println("}");
    }
    public static void copy2To5(int[][] mat) {
        for (int r = 0; r < 6; ++r) {
            mat[r][5 - 1] = mat[r][2 - 1];
        }
    }
}
