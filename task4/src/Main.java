import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws FileNotFoundException {
            String name1= args[0];
            File file = new File(name1);
            Scanner scanner = new Scanner(file);
            int[] nums= new int[1000];
            int count=0;
            while (scanner.hasNextInt()){
                nums[count]= scanner.nextInt();
                count++;
            }
            int[] numbers = new int[count];
            for (int i=0;i<count;i++){
                numbers= Arrays.copyOf(nums,count);
            }
            Arrays.sort(numbers);
            int median;
            if (numbers.length % 2 == 0)
                median = ((numbers[numbers.length/2]) + (numbers[numbers.length/2 - 1]))/2;
            else
                median = numbers[numbers.length/2];
            int counter=0;
            for (int i=0;i<numbers.length;i++){
                while (numbers[i]!=median){
                    if (numbers[i]<median){
                        numbers[i]++;
                        counter++;
                    }
                    if (numbers[i]>median){
                        numbers[i]--;
                        counter++;
                    }
                }
            }
            System.out.println(counter);
        }
}