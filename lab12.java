import wk12.*;
public class lab12Main {
public static void main(String [] args) {
    ArrayProcessor counter = (arr) -> {
    return arr.length;
};
    ArrayProcessor max = (arr) -> {
    int maxs = arr[0];

    for (int i = 1; i < arr.length; i++) {
      maxs = Math.max(maxs, arr[i]);

    }
       return maxs;
   };
    ArrayProcessor sum = (arr) -> {
    int maxs = 0;

    for (int i = 1; i < arr.length; i++) {
      maxs += arr[i];
    }
    return maxs;
   };
    ArrayProcessor average = (arr) ->{
    int maxs = 0;

    for (int i = 1; i < arr.length; i++) {
      maxs += arr[i];
    }
    maxs = maxs/arr.length;
    return maxs;
   };

   int [] data = {28, 58, 8, 18, 78, 68};

   System.out.print("counter = ");
   System.out.println((int)counter.apply(data));
   System.out.print("Max = ");
   System.out.println((int)max.apply(data));
   System.out.print("Sum = ");
   System.out.println((int)sum.apply(data));
   System.out.print("average = ");
   System.out.println((int)average.apply(data));

}
}