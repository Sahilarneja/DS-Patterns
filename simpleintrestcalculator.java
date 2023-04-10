import java.util.Scanner;
public class simpleintrestcalculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter P");
        double p=sc.nextInt();
        System.out.println("Enter R");
        double r=sc.nextInt();
        System.out.println("Enter T");
        double t=sc.nextInt();
        System.out.println("Your result is:");
        double prt= p*r*t/100;
        System.out.println(prt);
    }
}
