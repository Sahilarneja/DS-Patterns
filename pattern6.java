import java.util.Scanner;

public class pattern6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                int sum;
                sum=n-j;
                System.out.print(sum);
            }
            System.out.println();
        }
    }
}