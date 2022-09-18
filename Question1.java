public class Question1 {
    public class Node{
        int data;
        Node next;
        public Node(int d){
            data = d;
        }
    }
    Node head = null;
     


    public String toString(){
        StringBuffer sb = new StringBuffer("head");
        Node p = head;
        while(p!=null){
            sb.append("-->[");
            sb.append(p.data);
            sb.append("]");
            p=p.next;
        }
        sb.append("->null");
        return new String(sb);
    }
    
    public int getGetAt(int i) {
        Node p = head;
        while(i>0){
            p = p.next;
            i--;
        }
        return p.data;
    }
    public void setSetAt(int d, int i) {
        Node p = head;
        while(i>0){
            p =p.next;
            i--;
        }
        p.data = d;
    }

    public void add(int d){
        Node p = new Node(d);
        p.next = head;
        head = p;
    }
     
    public void insert(int d, Node p){
        Node q = new Node(d);
        q.next = p.next;
        p.next = q;
    }

    public Node find(int d){
        Node p=head;
        while(p!=null){
            if(p.data==d)
            return p;p=p.next;
        }
        return null;
    }


    public void delete(int d){
        Node t= new Node(0);
        t.next=head;
        Node p=t;
        while((p.next!=null)&&(p.next.data!=d)){
            p=p.next;}
            if(p.next!=null){   
            head=t.next;
        }
    }

    public void rotate(int d){
        if(d == 0){
            return;
        }
        
        Node current = head;

        int count = 1;
        while(count < d && current != null){
            current = current.next;
            count++;
        }

        if (current == null)
            return;

        Node kthNode = current;

        while (current.next != null)
            current = current.next;
            
        current.next = head;
        head = kthNode.next;
        kthNode.next = null;
    }
}