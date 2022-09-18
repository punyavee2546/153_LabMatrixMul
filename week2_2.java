import java.util.Scanner;
public class week2_2 {
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
           
            System.out.println("radius : " +c.getRadius());
            
            c.setRadius(300);

            System.out.println("radius : " +c.getRadius());


        }
    
    
    
    }
}
