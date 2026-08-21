public class RotateImage_48 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        RotateImage_48 obj = new RotateImage_48();  
        obj.rotate(matrix);
        printMatrix(matrix);

    }
    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void rotate(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0; i<matrix.length; i++){
            int[] temp = matrix[i];
            reverse(temp);
            matrix[i] = temp;   
        }

    }
    public void reverse(int[] arr){
        for(int i=0; i<arr.length; i++){
            int start = 0;
            int end = arr.length-1;
            while(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--; 
            }
        }
    }
}
