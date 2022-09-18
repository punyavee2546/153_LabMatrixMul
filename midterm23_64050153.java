import java.util.Arrays;

public class midterm23_64050153 {
    public static void main(String[] args) {
        int[] num = {40,4,7,1,35,27,27};
        System.out.println(Arrays.toString(farthestPair(num)));
       }
    public static int[] farthestPair(int[] input){
        int pa = Integer.MAX_VALUE;
        int pb = Integer.MIN_VALUE;
        for(int i = 0;i < input.length;i++){
            if(input[i] < pa){
                pa = input[i];
            }
            if(input[i] > pb){
                pb = input[i];
            }
        }
    
        int[] farPAir = {pa , pb};
        return farPAir;
    }
}
