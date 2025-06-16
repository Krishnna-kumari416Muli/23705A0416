class Main {
    public static void main (String[] args) {
        int num=1234;
        int count=0;
        while(num>0){
          int  module=num % 10;
            
            if(module % 2 != 0) {
                count= count + 1;
            }
            num=num / 10;
        }
         System.out.println(count);
    }   
}