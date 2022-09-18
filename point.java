public class point {
    public int x =0;
    public int y =0;
    public point(int x, int y){
        this.x =x;
        this.y =y;
    }
    public String toString(){
        return "(" + x + "," + y + ")" ;
    }
    public int getX (){
        return x;
    }
    public int getY (){
        return y;
    }

    public void moveLeft(int d) {
        x = x - d;
    }

    public void moveRight(int d) {
        x = x + d;
    }

    public void moveUp(int d) {
        y = y + d;
    }

    public void moveDown(int d) {
        y = y - d;
    }
    
}