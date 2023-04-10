import java.util.Scanner;

public class sumof5elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
