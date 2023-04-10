import java.util.Scanner;
public class add2num {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your integer i");
        int i =sc.nextInt();
        System.out.println("Enter your integer j");
        int j =sc.nextInt();
        System.out.println("Your sum is:");
        int sum;
        sum= i + j;
        System.out.println(sum);
    }
}
