//64050153 ปุณยวีร์ อดิศักดิ์วัฒนา
public class MyPQueue {
    MyMinHeap heap = new MyMinHeap();
    public void enqueue(int d){
        heap.insert(d);
    }
    public int dequeue(){
        return heap.remove();
    }
    public int front(){
        return heap.peek();
    }
    public boolean isFull(){
        return heap.isFull();
    }
    public boolean isEmpty(){
        return heap.isFull();
    }
    public String toString(){
        return heap.toString();  
    } 
}