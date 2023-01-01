public class DiagonalMatrixTraversal {

    private static int[] alternateFroward(int[][] mat) {
        int X = mat.length; // Width
        int Y = mat[0].length; // Height
        int[] result = new int[X * Y];

        int startX = 0; // Starting points in matrix
        int x; // Coordinates
        int y;
        int[] buffer = new int[X * Y]; // To reverse order to result
        boolean forward = true;
        int i = 0; // Committing index

        while (i < result.length) {
            x = (startX < X) ? startX : X - 1;
            y = (startX < X) ? 0 : (startX - X) + 1;

            int j = 0;
            while (x >= 0 && y < Y)
                buffer[j++] = mat[x--][y++];

            if (forward) {
                for (int n = 0; n < j; n++)
                    result[i++] = buffer[n];
            } else {
                for (int n = j - 1; n >= 0; n--)
                    result[i++] = buffer[n];
            }

            forward = !forward;
            startX++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++)
                System.out.print(matrix[y][x] + " ");
            System.out.println();
        }
        
        System.out.println("In diagonal, bottom-left -> top-right alternating :");

        int[] result = alternateFroward(matrix);
        for (int n : result)
            System.out.print(n + " ");
        System.out.println();
    }

}
