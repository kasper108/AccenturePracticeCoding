package Day3.Task1;

public class Main {
    public static void main(String[] args) {
        int[][] resultArray = new int[10][10];

        for(int i = 0 ; i < 10 ; i++){
            for(int ii = 0 ; ii < 10 ; ii++){
                resultArray[i][ii] = (i + 1) * (ii + 1);
                System.out.print(resultArray[i][ii] + " ");
            }
            System.out.println();
        }
    }
}
