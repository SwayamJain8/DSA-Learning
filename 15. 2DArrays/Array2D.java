// import java.util.*;

public class Array2D {

    public static void search(int matrix[][], int key) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (key == matrix[i][j]) {
                    System.out.println("Key Found Successfully");
                    return;
                }
            }
        }
        System.out.println("Key Not Found");
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        // Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 8);
    }
}
