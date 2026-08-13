import java.util.Scanner;
import java.util.ArrayList;
public class multidimensionArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        System.out.println("Enter the number of rows:");
        int rows = in.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = in.nextInt();

        // Initialize the 2D ArrayList
        for (int i = 0; i < rows; i++) {
            matrix.add(new ArrayList<>());
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter element at [" + i + "][" + j + "]:");
                matrix.get(i).add(in.nextInt());
            }
        }

        // Display the 2D ArrayList
        System.out.println("You entered:");
        for (ArrayList<Integer> row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        in.close();
    }
}
