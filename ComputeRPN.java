import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class ComputeRPN 
 {
        private static Pattern pattern= Pattern.compile("-?\\d+(\\.\\d+)?");
        public static boolean isNumeric(String strNum) {
            if (strNum== null) {
                return false; 
            }
            return pattern.matcher(strNum).matches();
        }
        public static void main(String[] args){
            MyStackA stack= new MyStackA();
            Scanner in = new Scanner(System.in);
            String rpn= in.nextLine();
            StringTokenizer st= new StringTokenizer(rpn);
            while(st.hasMoreTokens()){
                String t = st.nextToken();
                System.out.println(t+" is a number -> "+isNumeric(t));
                if(isNumeric(t)){
                    stack.push(Integer.parseInt(t));
                }else{
                    if(t.equals("-")){
                        int b = stack.pop();
                        int a = stack.pop();
                        stack.push(a-b);
                    }
                    else if(t.equals("+")){
                        int b = stack.pop();
                        int a = stack.pop();
                        stack.push(a+b);
                    }
                    else if(t.equals("*")){
                        int b = stack.pop();
                        int a = stack.pop();
                        stack.push(a*b);
                    }
                    else if(t.equals("/")){
                        int b = stack.pop();
                        int a = stack.pop();
                        stack.push(a/b);
                    }
                }
                
            }
            System.out.println("result: "+ stack.pop());
            in.close();
        }
}