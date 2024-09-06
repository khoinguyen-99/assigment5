
package student;


public class Student {
    int ID;
    String name;
    public Student(int ID,String name) {
        this.ID = ID;
        this.name = name;
        
    }
    void displayformation(){
        System.out.println("ID:" + ID+ ",Name:" + name);
    }
    }
