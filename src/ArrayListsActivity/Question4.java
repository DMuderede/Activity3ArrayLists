package ArrayListsActivity;

public class Question4 {

    public static void main(String[] args) {
        int rows = 2, columns = 4;
        double  sumRow, sumCol;

        double[][] ShopsAB = {{12.45, 100.23, 96.99, 245.50}, {11.39, 100.80, 94.78, 247.00}};

       // double[][] sum = new double[rows][columns];
        //for (int i = 0; i < rows; i++) {
            //for (int j = 0; j < columns; j++) {
                //sum[i][j] = ShopsAB[i][j];

        for(int i = 0; i < rows; i++) {
            sumRow = 0;
            for (int j = 0; j < columns; j++) {
                sumRow = sumRow + ShopsAB[i][j];
            }
            System.out.print( sumRow);
        }

        for(int i = 0; i < columns; i++){
            sumCol = 0;
            for(int j = 0; j < rows; j++){
                sumCol = sumCol + ShopsAB[j][i];
            }
            System.out.print( sumCol);
        }






        }}