public class MyStackL {
    public class Node{
        int data;
        Node next;
        public Node(int d){
            data = d;
        }
        
    }
    Node top = null;

    public int top(){
        return top.data;
    }
    public boolean isFull(){
        return false;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public void push(int d){
        Node p = new Node(d);
        p.next = top;
        top = p;
    }

    public int pop(){
        int d = top.data;
        top = top.next;
        return d;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer("head");
        Node p = top;
        while(p!=null){
            sb.append("-->[");
            sb.append(p.data);
            sb.append("]");
            p=p.next;
        }
        sb.append("->null");
        return new String(sb);
    }
    
}