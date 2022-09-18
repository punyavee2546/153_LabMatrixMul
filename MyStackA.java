import java.util.Arrays;

public class MyStackA {
    int MAX_SIZE = 100;
    int stack[] = new int[MAX_SIZE];
    int top = 0;

    public int Top() {
        return MAX_SIZE;
    }
    public void push(int d){
      stack[top++] = d;
    }
    public int pop(){
       return stack[--top];
    }
    public boolean isFull() {
        return top==MAX_SIZE;
    }
    public boolean isEmpty() {
        return top==0;
    }
    @Override
    public String toString() {
        return "MyStackA [MAX_SIZE=" + MAX_SIZE + ", stack=" + Arrays.toString(stack) + ", top=" + top + "]";
    }
}
