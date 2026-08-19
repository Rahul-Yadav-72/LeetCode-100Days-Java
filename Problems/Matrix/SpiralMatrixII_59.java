public class SpiralMatrixII_59 {
    public static void main(String[] args) {
        int[][] result = new SpiralMatrixII_59().generateMatrix(3);
        for (int i = 0; i < result.length; i++) {   
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;
        while (num <= n * n) {
            // 1. left -> right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;
            // 2. top -> bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // 3. right -> left
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;
            // 4. bottom -> top
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }
        return matrix; 
    }
}