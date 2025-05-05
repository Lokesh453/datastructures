import java.io.Serializable;

public class Student implements Serializable{
    String name;
     int rollNum;

     Student(String name ,int rollNum ) {
        this.name = name;
        this.rollNum = rollNum;
     }

     public String getName() {
         return this.name;

     }
     public int getRollNum() {
         return this.rollNum;
     }
}
