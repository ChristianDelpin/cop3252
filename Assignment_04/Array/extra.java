import java.util.Random;

public class extra {
    public static void main(String[] args) {
        int[][] array = new int[6][4];
        Random random = new Random();
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += array[i][j];
            }
            array[i][3] = sum;
        }
        
        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += array[i][j];
            }
            array[5][j] = sum;
        }
        
        array[5][3] = 0;
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}