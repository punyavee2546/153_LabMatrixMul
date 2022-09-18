import static javax.swing.text.html.HTML.Attribute.N;

public class MyArray {

    int size;
    int[] data;
    int MAX_SIZE;

    public MyArray(int N) {
        MAX_SIZE = N;
        data = new int[MAX_SIZE];
    }

    public void add(int d) {
        data[size++] = d;
    }

    public void insert(int d, int index) {
        for(int i = size ; i > index ; i--) {
            data[i] = data[i-1];
        }
        data[index] = d;
        size++;
    }

    public int find(int d) {
        int index = -1;
        for(int i = 0 ; i < size ; i++) {
            if(data[i] == d) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int binarySearch(int d) {
        int a = 0, b = size-1;
        while (a <= b) {
            int m = (a+b) / 2;
            if (data[m] == d) return m;
            if (d < data[m]) b = m-1;
            else a = m + 1;
        }
        return  -1;
    }

    public void deleteU(int index) {
        data[index] = data[--size];
    }

    public void deleteO(int index) {
        for(int i = index ; i <-- size ; i++) {
            data[i] = data[ i + 1 ];
        }
        size--;
    }
}
