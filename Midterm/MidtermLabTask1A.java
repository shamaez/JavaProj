import java.util.Scanner;

public class MidtermLabTask1A {

    public static void main(String[] args) {

        // 1. Declare and create array
        int[][] matrix = new int[3][3];

        // 2. Create a Scanner class to accept user input
        Scanner input = new Scanner(System.in);
        char choice;

        do {

            // 3. Create nested Loops for the 2D array inputs
            System.out.println("Input 9 elements:");

            for(int r = 0; r < matrix.length; r++)
            {
                for (int c = 0; c < matrix[r].length; c++)
                {
                    int num = input.nextInt();
                    matrix[r][c] = num;
                }
            }

            // 4. Declare arrays for row and column sums
            int[] rowS = new int[3];
            int[] colS = new int[3];

            int diagonal1 = 0;
            int diagonal2 = 0;

            // 5. Calculate the row, column, and diagonal sums
            for (int r = 0; r < matrix.length; r++)
            {
                for (int c = 0; c < matrix[r].length; c++)
                {
                    rowS[r] += matrix[r][c];
                    colS[c] += matrix[r][c];

                    // First diagonal
                    if (r == c)
                    {
                        diagonal1 += matrix[r][c];
                    }

                    // Second diagonal
                    if (r + c == 2)
                    {
                        diagonal2 += matrix[r][c];
                    }
                }
            }

            // 6. Display outputs
            System.out.println();
            System.out.println("Here are the Numbers and the required outputs:");
            System.out.println("=============================================");

            System.out.printf("%22s%n", "Row Sum");

            // Display matrix and row sums
            for (int r = 0; r < matrix.length; r++)
            {
                for (int c = 0; c < matrix[r].length; c++)
                {
                    System.out.printf("%3d", matrix[r][c]);
                }
                System.out.printf("%10d%n", rowS[r]);
            }

            // 7. Display column sums
            System.out.print("\nColumn sum: ");
            for (int c = 0; c < colS.length; c++)
            {
                System.out.printf("%4d", colS[c]);
            }

            // MODIFY
            int totalSum = 0;
            for (int t = 0; t < colS.length; t++)
            {
                totalSum = colS[t] + totalSum;
            }
            System.out.print("\nTotal Column sum: " + totalSum);

            // 8. Display diagonal sums
            System.out.println("\n=============================================");
            System.out.println("Diagonal sum 1: " + diagonal1);
            System.out.println("Diagonal sum 2: " + diagonal2);

            // 9. Ask user to try again
            System.out.print("\nTry Again [y/n]: ");
            choice = input.next().toLowerCase().charAt(0);

        } while (choice == 'y');
        input.close();
    }
}


//Modify the same code and display the total of all COLUMN SUM