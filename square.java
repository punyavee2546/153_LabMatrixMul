public class square extends rectangle {
    public square(int w, int h, point p){
        super(w, h, p);
    }

    
    @Override
        public String toString() {
            return getHeight() + ", " + getWidth();
        }
        public void setWidth(int w){
            this.width = w;
            this.height = w;
        }
        
}