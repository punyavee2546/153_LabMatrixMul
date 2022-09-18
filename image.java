import java.util.*;
public class image {
    private ArrayList<shape> listShape = new ArrayList<>();
    public void addShape(shape shape){
        this.listShape.add(shape);
    }
    public void draw(){
        for(shape s : listShape){
            System.out.println(s.toString());
        }
    }
    public void printArea(){
        for(shape e : listShape){
            System.out.println("Area of "+ e.getClass().getName() +" = "+ e.calculateArea());
            if (e instanceof circle){
                circle c2 = (circle) e;
                System.out.println("Circumference = " + c2.calculateCircumference());
            }
        }
    } 
}