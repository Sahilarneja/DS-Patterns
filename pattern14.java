import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 1; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 3; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

