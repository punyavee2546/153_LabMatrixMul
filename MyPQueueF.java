//64050153 ปุณยวีร์ อดิศักดิ์วัฒนา
import java.util.Iterator;
public class MyPQueueF {
    FibonacciMinPQ<Integer> heap = new FibonacciMinPQ<Integer>();
    public boolean isEmpty(){
        return heap.isEmpty();
    }
    public void insert(int d){
        heap.insert(d);
    }
    public int delMin(){
        return heap.delMin();
    }
    public int minKey(){
        return heap.minKey();
    }
    public String toString(){
        StringBuffer sb = new StringBuffer("top ");
        Iterator p = heap.iterator();

        while(p.hasNext()){
            sb.append("--> [");
            sb.append(p.next());
            sb.append("]");
        }
        sb.append("--> null");
        return new String(sb);
    }
}

