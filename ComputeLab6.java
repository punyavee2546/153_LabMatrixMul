import java.util.StringTokenizer;

public class ComputeLab6 {
    MyStackL6 Stack = new MyStackL6();
    String input = "9 5 - 8 2 + 3 / *";
    StringTokenizer st = new StringTokenizer(input);
    ComputeLab6() {
    }
    ComputeLab6(String Postfix) {
        input = Postfix;
        this.st = new StringTokenizer(input);
        System.out.println(Compute());
    }
    public double Compute() {
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            if(token.equals("+")){
                double b = Stack.pop();
                double a = Stack.pop();
                Stack.push(a+b);
            }else if(token.equals("-")){
                double b = Stack.pop();
                double a = Stack.pop();
                Stack.push(a-b);
            }else if(token.equals("*")){
                double b = Stack.pop();
                double a = Stack.pop();
                Stack.push(a*b);
            }else if(token.equals("/")){
                double b = Stack.pop();
                double a = Stack.pop();
                Stack.push(a/b);
            }else {
                Stack.push(Double.parseDouble(token));
            }
        }
        double result = Stack.pop();
        return result;
    }
    public static void main(String[] args) {
        ComputeLab6 RPN = new ComputeLab6();
        System.out.println(RPN.Compute());
    }
}