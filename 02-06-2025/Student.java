public class Student{
    String name="jeshu";
    String roll ="23705a0416";
    String branch = "ECE";
    byte year = 3;
    char section='b';
    
    void payfee(int amount){
        System.out.println("payfee"+ amount +"to the clg");
    }
    int attendence(){
        System.out.println("sending the attendence to the sstudent");
        return 30;
    }
}
public class Main{
    public static void  main(String[] args){
        Student s1= new Student();
        System.out.println(s1.name);
         System.out.println(s1.roll);
          System.out.println(s1.attendence());
          s1 . payfee(1000);
    }
}