import java.util.ArrayList;

public class Cmain {
    public static void main(String[] args) {
        image i = new image();
        shape c = new circle(2,2,7);

        square s = new square(5, 8, new point(2,3) );
        s.setWidth(7);

        rectangle r = new rectangle(5, 8, new point(5, 6));

       i.addShape(c);
       i.addShape(r);
       i.addShape(s);
       i.printArea();
        
    }
}