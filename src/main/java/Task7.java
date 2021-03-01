import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void showArray(int[][] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr.length; j++) {
                if (j != arr[i].length - 1) {
                    System.out.print(arr[i][j] + ", ");
                } else {
                    System.out.print(arr[i][j]);
                }
            }
            if (i != arr.length - 1) {
                System.out.println("], ");
            } else {
                System.out.print("]");
            }
        }
        System.out.println("]");
    }

    public static int[][] newRandomArray(int n, int m) {
        Random rand = new Random();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int random_number = rand.nextInt(m + m + 1) - m;
                matrix[i][j] = random_number;
            }
        }
        return matrix;
    }

    public static int[][] sortArrayByColumn(int[][] Array, int columnNumber) {
        for (int i = 0; i < Array.length; i++) {
            for (int k = i + 1; k < Array.length; k++) {
                if (Array[i][columnNumber] > Array[k][columnNumber]) {
                    for (int j = 0; j < Array.length; j++) {
                        int temp = Array[i][j];
                        Array[i][j] = Array[k][j];
                        Array[k][j] = temp;
                    }
                }
            }
        }
        return Array;
    }

    public static int[][] sortArrayByRow(int[][] Array, int rowNumber) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = rowNumber; i == rowNumber; i++) {
                for (int j = 1; j < Array.length; j++) {
                    if (Array[i][j] < Array[i][j - 1]) {
                        int temp = Array[i][j];
                        Array[i][j] = Array[i][j - 1];
                        Array[i][j - 1] = temp;
                        isSorted = false;
                    }
                }
            }

        }
        return Array;
    }

    public static void main(String[] args) {
        System.out.println("Enter the dimension of the matrix: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter a range of values ");
        int m = scan.nextInt();
        System.out.println("New " + n + "x" + n + " array with random numbers from -" + m + " to " + m + ":");
        int[][] matrix = newRandomArray(n, m);
        showArray(matrix);
        System.out.println("Enter the column number to sort from 0 to " + (n - 1));
        int columnNumber = scan.nextInt();
        sortArrayByColumn(matrix, columnNumber);
        System.out.println("Sorted array by column " + columnNumber + ":");
        showArray(matrix);
        System.out.println("Enter the row number to sort from 0 to " + (n - 1));
        int rowNumber = scan.nextInt();
        scan.close();
        sortArrayByRow(matrix, rowNumber);
        System.out.println("Sorted array by row " + rowNumber + ":");
        showArray(matrix);

    }
}
