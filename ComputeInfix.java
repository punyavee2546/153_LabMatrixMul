import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class ComputeInfix {
    MyQueueL queue = new MyQueueL();
    MyStackInfix stack = new MyStackInfix();
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    StringTokenizer st = new StringTokenizer(input);
    private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }
    public void Infix(){
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            if(isNumeric(token)) {
                queue.enqueue(token);
            } else if (token.equals("-") || token.equals("*") || token.equals("/") || token.equals("+")) {
                if(!stack.isEmpty()){
                    while(CompareOp(token, stack.top())) {
                        queue.enqueue(stack.pop());
                        if (stack.isEmpty()) {
                            break;
                        }
                    }
                }
                stack.push(token);
            } else if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                while (!(stack.top().equals("("))) {
                    queue.enqueue(stack.pop());
                }
                stack.pop();
            }
        }
        while(!(stack.isEmpty())) {
            queue.enqueue(stack.pop());
        }
    }
    public boolean CompareOp(String token, String top) {
        if ((stack.top().equals("(") || stack.top().equals(")"))){
            return false;
        }
        if (token.equals("*") || token.equals("/")) {
            if (stack.top().equals("+") || stack.top().equals("-")){
                return false;
            }
        }
        return true;
    }
    public void Display(){
        String Postfix = "";
        
        System.out.println("Infix : "+input);
        while(!queue.isEmpty()) {
            Postfix += queue.dequeue() + " ";
        }
        System.out.println("Postfix : " + Postfix);
        ComputeLab6 in = new ComputeLab6(Postfix);
    }
    public static void main(String[] args) {
        ComputeInfix Infix = new ComputeInfix();
        Infix.Infix();
        Infix.Display();
    }
}