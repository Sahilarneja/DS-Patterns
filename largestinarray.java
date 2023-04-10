import java.util.Scanner;

public class largestinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr = new int [size];
        int max=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]);
                max=arr[i];
        }
        System.out.println(max);
    }
}