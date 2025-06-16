import java.util.*;
class Main {
    public static void main(String[] args) {
        int number= 11;
        int fact = 0;
        
        for(int i=1;i<=number;i++){
            if(number % i==0){
                fact ++;
            }
        }
        if(fact == 2){
            System.out.println("prime");
            
        }else{
            System.out.println("not prime");
        }
    }
}