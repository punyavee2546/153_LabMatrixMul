public class Calculate {

    private int [][] matrix1;
    private int [][] matrix2;
    private int[][] ans1;

    Calculate(int [][] matrix1) {

        System.out.println("1");
        this.matrix1 = matrix1;
        ans1 = new int[matrix1.length][matrix2[0].length];
    }

    public void CalMatrix(int nMax) {

        System.out.println(" \n 2 ");
        int n = 0;

        while (n < nMax) {
            int [][] anser = new int[matrix1.length][matrix2[0].length];
            for (int row = 0 ; row < matrix1.length ; row++) {
                for (int colum = 0 ; colum < matrix2[row].length ; colum++) {
                    for (int k = 0 ; k < matrix1[row].length ; k++) {
                        anser[row][colum] += matrix1[row][colum]*matrix2[k][colum];
                    }
                }
            }
            matrix1 = anser;
            n++;

            if (n == nMax) {
                ans1 = anser;
                System.out.println("end 2");
            }
        }
        n=0;
    }

    public void Display(){
        for(int i = 0; i < ans1.length; i++){
            System.out.print(" | ");
            for(int j = 0; j < ans1[i].length; j++){
                System.out.print(" " + ans1[i][j] + " ");
            }
            System.out.print(" | ");
            System.out.println("");

        }
        System.out.println("");
        System.out.println("");
    }

    public void Display(int [][] Matrix){
        for(int i = 0; i < Matrix.length; i++){
            System.out.print(" | ");
            for(int j = 0; j < Matrix[i].length; j++){
                System.out.print(" " + Matrix[i][j] + " ");
            }
            System.out.print(" | ");
            System.out.println("");

        }
        System.out.println("");
        System.out.println("");
    }
}
