public class rectangle extends shape {
    public rectangle(int w, int h, point p){
        width=w;
        height=h;
        this.p=p;
    }
    @Override
    public double calculateArea(){
        return width*height;
    }
    
}