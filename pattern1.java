import java.util.Scanner;
public class pattern1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for (i = 1; i <= n; i++) {
            int j;
            for (j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}