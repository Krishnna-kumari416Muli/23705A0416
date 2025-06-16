public class Teacher{
    String name;
    String id;
    String[] subjects;
    String dept;;
    String qualification;
    Teacher(String name,String id,String[] subjects,String dept,String qualification){
    this.name=name;
    this.id=id;
    this.subjects=subjects;
    this.dept=dept;
    this.qualification=qualification;
    
    }
    
    void details(){
        System.out.println("teacher name:"+ name);
        System.out.println("teacher id:"+ id);
        System.out.print("teacher subjects:"+ subjects);
        System.out.println("teacher dept:"+ dept);
        System.out.println("teacher qualification:"+ qualification);
        for(String subject : subjects){
            System.out.println(" , ");
        }
        System.out.println();
        
    }
   
}

public class Main{
    public static void  main(String[] args){
        
          Teacher t1= new Teacher("lakshmi devi","7893468369u","ece","b tech", new Teacher[]{"dld","cs"});
        
          t1 . details();
    }
}