import java.util.Scanner;

public class Mainn {

    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);

        int [][] matrix1 = {{0, 1, 0}, {1, 1, 2}, {0, 2, 0}};

        Calculate calculate = new Calculate(matrix1);

        System.out.println("A^");

        int n = input.nextInt();

        calculate.CalMatrix(n);
        calculate.Display(matrix1);
        calculate.Display();
    }

}