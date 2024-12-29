
class Pen {
    String color; 
    String type ;
    public void write (){
        System.out.println("write something");

    }
    public void pcolor (){
        System.out.println(this.color);
    }

    
}
class Student {
    String name ;
    int age ;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class dsastudy{
    
    public static void main(String[] args) {
       
        // Pen pen1 = new Pen();
        // pen1.color= "blue";
        // pen1.type= "gel";
        // pen1.write();
        // pen1.pcolor ();
        Student s1 =new Student();
        s1.name="nayan";
        s1.age=20;
        s1.printInfo();
        System.out.println();

    }
}