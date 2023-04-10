import java.util.Scanner;

public class largestandsmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if (max > arr[i]) ;
            max = arr[i];
            if (min < arr[i]) ;
            min = arr[i];
        }
        System.out.println("Largest value is:"+ max);
        System.out.println("Smallest value is:"+ min);
    }
}

