import java.util.Scanner;

public class charpattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                char c=(char)('A'+i-1);
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
