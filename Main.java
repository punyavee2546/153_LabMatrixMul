import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {{0, 1, 0},
                          {1, 1, 2},
                          {0, 2, 0}};
        int[][] matrixSum = matrix;
        System.out.print("Enter : ");
        int n = sc.nextInt();
        MultiMatrix multimat = new MultiMatrix();
        for(int i = 1; i < n; i++){
            matrixSum = multimat.koon(matrix, matrixSum);
        }
    }
    
}