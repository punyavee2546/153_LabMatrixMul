public class MultiMatrix {
    private int[][] result;

    public int[][] koon(int[][] sample, int[][] sum){
        int temp = 0;
        result = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                for(int z = 0; z < 3; z++){
                    temp += sample[z][j]*sum[i][z];
                }
                result[i][j] = temp;
                temp = 0;
            }
        }
        return result;
    }
}