import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=4;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=4;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
