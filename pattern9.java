import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum=i-j+1;
                System.out.print(sum);
            }
            System.out.println();
        }
    }
}
