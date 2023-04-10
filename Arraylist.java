import java.util.*;

import javax.swing.event.SwingPropertyChangeSupport;
public class Arraylist{
    public static void main(String args[]){
    ArrayList<String> list=new ArrayList<String>();
    list.add("sahil");
    list.add("sanyam");
    list.add("krati");
    list.add("vidit");

    // System.out.println(list.contains("sahil"));

    // System.out.println(list.indexOf("krati"));
    // System.out.println(list.get(3));
    // for(String str:list){
    //     System.out.println(str);
    // }

    System.out.println("------using Iterator-----");
    Iterator<String> itr=list.iterator();
    while(itr.hasNext()){
        System.out.print(itr.next()+", ");
    }
    System.out.println();
    System.out.println("---------using ListIterator-----");
    ListIterator listitr=list.listIterator(list.size());
    System.out.println();
        while(listitr.hasPrevious()){
            System.out.print(listitr.previous()+" ");
        }
    }
    }


    

