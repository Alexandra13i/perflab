import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws FileNotFoundException {
            String name1= args[0];
            String name2= args[1];

            File file1 = new File(name1);
            Scanner scanner1 = new Scanner(file1);
            float [] numbers= new float [2];
            float radius=0;
            while (scanner1.hasNext()){
                numbers[0]= scanner1.nextFloat();
                numbers[1]= scanner1.nextFloat();
                radius=scanner1.nextFloat();
            }

            File file2 = new File(name2);
            Scanner scanner2 = new Scanner(file2);
            float [][] coordinates= new float [100][2];
            int counter=0;
            while (scanner2.hasNext()){
                coordinates[counter][0]= scanner2.nextFloat();
                coordinates[counter][1]= scanner2.nextFloat();
                counter++;
            }
            float[][] dots = new float[counter][2];
            for (int i=0;i<counter;i++){
                dots[i]= Arrays.copyOf(coordinates[i],2);
            }
            float distance=0;

            for (int i=0;i< dots.length;i++){
                distance= (float) Math.sqrt(Math.pow((dots[i][0]-numbers[0]),2)+ Math.pow((dots[i][1]-numbers[1]),2));
                if (distance==radius) {
                    System.out.println(0);
                }
                if (distance<radius){
                    System.out.println(1);
                }
                if (distance>radius){
                    System.out.println(2);
                }
            }
        }
}