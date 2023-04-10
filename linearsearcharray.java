import java.util.Scanner;
public class linearsearcharray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
           int val=sc.nextInt();
            if(arr[i]==val){
                System.out.println(i+1);
            }
        }
 //       System.out.println(arr);
    }
}
