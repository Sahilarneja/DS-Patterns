import java.util.Scanner;

public class arraysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i <= arr.length; i++) {
            int val = sc.nextInt();
            if (val == arr[i]) {

            }
        }
    }
}

