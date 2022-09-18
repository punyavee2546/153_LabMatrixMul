import static javax.swing.text.html.HTML.Attribute.N;

public class ArrayTester {
    public static void main(String args []) {

        long start = 0;
        for (int N = 10000000; N <= 100000000; N += 10000000) {
            start = System.currentTimeMillis();
            MyArray mArray = new MyArray(N);
            for (int n = 1; n < N; n++) {
                mArray.add((int) (Math.random() * 1000));
            }
            long time = (System.currentTimeMillis() - start);
            System.out.println(N + " \t " + time);
        }
    }

    
}
.3 