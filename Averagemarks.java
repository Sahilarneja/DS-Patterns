import java.util.Scanner;
public class Averagemarks {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of the student");
        String name=sc.nextLine();
        System.out.println("Enter Marks of the student");
        int Marks1=sc.nextInt();
        int Marks2=sc.nextInt();
        int Marks3=sc.nextInt();
        int average=Marks1+Marks2+Marks3/3;
        System.out.println(name);
        System.out.println(Marks1+" "+Marks2+" "+Marks3);
        System.out.println(average);

    }
}
