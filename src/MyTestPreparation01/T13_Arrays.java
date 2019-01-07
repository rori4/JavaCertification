package MyTestPreparation01;

public class T13_Arrays {

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                /*INSERT CODE HERE*/
//                matrix[row][col] = (row+1)*(col+1);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}


/* Which of the following is the correct syntax?

matrix(row, col) = (row+1)*(col+1);
matrix[row][col] = (row+1)*(col+1);
matrix[row, col] = (row+1)*(col+1);
matrix(x)(y) = (row+1)*(col+1);


*/