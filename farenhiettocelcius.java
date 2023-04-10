import java.util.Scanner;
public class farenhiettocelcius {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temp");
        double temp=sc.nextDouble();
        double f=(temp-32)*5/9;
        System.out.println(f+"degree farenhiet");
    }
}
