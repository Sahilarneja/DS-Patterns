import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("Your n is even");
        }
        else{
            System.out.println("Your n is Odd");
        }
    }
}