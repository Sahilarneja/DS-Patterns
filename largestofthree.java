import java.util.Scanner;
public class largestofthree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("A is largest number");
        }
        else if (b>c && b>a) {
            System.out.println("B is largest number");
        }
        else{
            System.out.println("C is largest number");
        }
    }
}
