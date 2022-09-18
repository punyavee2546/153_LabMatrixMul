public abstract class shape implements movable, scalable {
    protected point p;
    protected int width ;
    protected int height;
    
    public shape (){}
    public shape(int w, int h, point p){
        this.p = p;
        this.width = w;
        this.height = h;
    }
    
    public abstract double calculateArea();

    public point getP(){
        return p;
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public void ScaleUp(Double d){
        width *= d;
        height *= d;
    }
    public void ScaleDown(Double d){
        width /= d;
        height /= d;
    }
    public void ScaleWUp(Double d){
        width *= d;
    }
    public void ScaleWDown(Double d){width /= d;}
    public void ScaleHDown(Double d){height *= d;}
    public void ScaleHUp(Double d){height /= d;}

    public void moveLeft(int d){p.x -= d;}
    public void moveRight(int d){p.x += d;}
    public void moveUp(int d){p.y += d;}
    public void moveDown(int d){p.y -= d;}
}