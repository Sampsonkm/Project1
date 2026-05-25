public class MatrixMultiplication {

    public static void main(String[] args) {

        // Define two input matrices
        int[][] matrixA = {
                {2, 4, 1},
                {3, 5, 7}
        };

        int[][] matrixB = {
                {1, 2},
                {0, 1},
                {4, 3}
        };

        // Create an empty result matrix
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        int[][] result = new int[rowsA][colsB];

        // Matrix multiplication using enhanced for loops
        int rowIndex = 0;
        for (int[] rowA : matrixA) {
            int colIndex = 0;

            for (int[] colB : transpose(matrixB)) {
                int sum = 0;

                int i = 0;
                for (int valueA : rowA) {
                    sum += valueA * colB[i];
                    i++;
                }

                result[rowIndex][colIndex] = sum;
                colIndex++;
            }

            rowIndex++;
        }

        // Display the resulting matrix
        System.out.println("Resulting Matrix:");
        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Helper method to transpose matrixB for easier column access
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposed = new int[cols][rows];

        int i = 0;
        for (int[] row : matrix) {
            int j = 0;
            for (int value : row) {
                transposed[j][i] = value;
                j++;
            }
            i++;
        }

        return transposed;
    }
}
