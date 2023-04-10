import java.util.*;
import java.io.*;
public class canvas_p1{
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<String>();
        File file=new File("dummy.txt");
       try{
         Scanner sc=new Scanner(file);
       }
       catch(Exception e){
        System.out.println(e);
       }

        System.out.println("------print All words-----");
        Iterator itr=words.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}