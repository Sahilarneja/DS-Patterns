import java.util.Scanner;
public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 2;
        while (d <= n - 1) {
            if (d % n == 0){
                System.out.println("it is not a prime number");}
            else{
                System.out.println("it is a prime number");
            }
        }
    }
}