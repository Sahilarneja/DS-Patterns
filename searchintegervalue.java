import java.util.Scanner;

public class searchintegervalue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int temp;
        temp=sc.nextInt();
        for(int i=0;i<arr.length;i++){

            if(temp==i) {
                System.out.println("Element is present");
            }
            else{
                System.out.println("not present");
            }
        }




    }
}
