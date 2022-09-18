public class Lab6Q1_65152 {
public static void main(String [] args){
    int [] arr = {10,12,23,23,16,23,21,16,};
    Lab6Q1_65152 n = new Lab6Q1_65152();
    System.out.println(n.xBar(arr));

System.out.println(n.standardDeviation(arr));
}
static double xBar(int [] arr){
    int sum = 0;
    for(int i = 0;i<arr.length;i++){
        sum += arr[i];
    }
return sum;
}
static double standardDeviation(int[]arr){
    double sBar = 0;
    double sum = 0;
    for(int i = 0;i<arr.length;i++){
        sum += arr[i];
    }
    double mean = 0;
    double sm = 0;
    mean = sum/arr.length;
    for(int j =0; j<arr.length;j++){
        sm+= Math.pow(mean-arr[j],2);
    }
    sBar = Math.sqrt(sm/arr.length);
    return sBar;
}
}
