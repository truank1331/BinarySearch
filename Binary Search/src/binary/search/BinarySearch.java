package binary.search;
import java.util.*;
class Student{
    int code;
    String name;
    int mark;
    Student(int code,String name,int mark){
        this.code = code;
        this.name = name;
        this.mark = mark;
    } 
}
public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] stu = new Student[1000];
        String key;
        int pp=0;
        for(int i=0;;i++){
            String c;
            String n;
            int m;
            String str = in.nextLine();
            String ss[] = str.split(" ");
            c = ss[0];
            if(ss.length>1){
                n=ss[1];
                m=Integer.parseInt(ss[2]);
                stu[i] = new Student(Integer.parseInt(c),n,m);
            }
            else{
                key = ss[0].trim();
                pp = i;
                break;
            }
        }
        boolean s = true;
        for(int i=0;i<pp;i++){
            if(key.equals(stu[i].name) || key.equalsIgnoreCase(Integer.toString(stu[i].code)) || key.equalsIgnoreCase(Integer.toString(stu[i].mark))){
                System.out.println(stu[i].code+" "+stu[i].name+" "+stu[i].mark);
                s = false;
                break;
            }
        }  
        if(s){
            System.out.println("Not found");
        }
    }
}
