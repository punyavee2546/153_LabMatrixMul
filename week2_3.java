import java.util.Scanner;
public class week2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter redius : ");
        double r = sc.nextDouble();
        System.out.print("Enter x position : ");
        int x = sc.nextInt();
        System.out.print("Enter y position : ");
        int y = sc.nextInt();

        if (r<0){
            System.out.println("Redius out of range"); 
        }else{
            point p = new point(x,y);
            circle c = new circle(p,r);
           
           
            System.out.println("The area of c : " + c.calculateArea());
            circle c2 = new circle(p,500);
            System.out.println("The area of c2 : " + c2.calculateArea());
            circle.PI = 3;
            System.out.println("The area of c : " + c.calculateArea());
            System.out.println("The area of c2 : " + c2.calculateArea());
 
        }
    }
}
