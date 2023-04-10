import java.util.Scanner;
public class arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter your elements: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
}
