import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                val=val+1;
                System.out.print(val);
            }
            System.out.println();
        }
    }
}