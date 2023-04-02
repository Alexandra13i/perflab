import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n= Integer.parseInt(args[0]);
        int m= Integer.parseInt(args[1]);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int S=0;
        for (int i=0;i<n;i++){
            System.out.print(arr[S]);
            S+=(m-1);
            while (S>(n-1)){
                S-=n;
            }
            if (i+1==n){
                i=-1;
            }
            if (arr[S]==1){
                break;
            }
        }
    }
}
