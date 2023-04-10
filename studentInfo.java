import java.util.*;
class student implements Comparable{
    int marks;
    String name;
    public student(String name,int marks){
        super();
        this.marks=marks;
        this.name=name;
    }

    public int getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }

    public String toString(){
        return "Name of the student is: "+name+"Marks: "+marks;
    }

    public int compareTo(student st2){
        if(this.getMarks()>st2.getMarks()){
            return 1;
        }
        else{
            return -1;
        }
    }
    public class studentInfo{
    public static void main(String args[]){
        ArrayList<student> st=new ArrayList<>();
        st.add(student("Sahil", 90));
        st.add(student("Sanyam", 95));
        st.add(student("Krati", 100)); 
        Collections.sort(st);
    }
}

public class sortByNamethenMarks{
    public int compare(student st1,student st2){
        if(st1.name.equals(st2)){
            return st1.marks-st2.marks;
        }
        else(st1.marks.equals(st2)){
            return st1.name-st2.name;
        }
    }
}
}