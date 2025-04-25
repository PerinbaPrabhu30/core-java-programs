import java.util.Scanner;

public class smallestarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements for the 1D array: ");
        int n = scanner.nextInt();

        int[] oneDArray = new int[n];
        System.out.println("Enter the elements for the 1D array:");
        for (int i = 0; i < n; i++) {
            oneDArray[i] = scanner.nextInt();
        }

        int smallestOneD = oneDArray[0];
        for (int i = 1; i < n; i++) {
            if (oneDArray[i] < smallestOneD) {
                smallestOneD = oneDArray[i];
            }
        }
        System.out.println("Smallest number in 1D array: " + smallestOneD);


        System.out.print("\nEnter the number of rows for the 2D array: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for the 2D array: ");
        int cols = scanner.nextInt();

        int[][] twoDArray = new int[rows][cols];
        System.out.println("Enter the elements for the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoDArray[i][j] = scanner.nextInt();
            }
        }

        int smallestTwoD = twoDArray[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (twoDArray[i][j] < smallestTwoD) {
                    smallestTwoD = twoDArray[i][j];
                }
            }
        }
        System.out.println("Smallest number in 2D array: " + smallestTwoD);

        scanner.close();
    }
}
