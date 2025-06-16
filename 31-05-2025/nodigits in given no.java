class Main {
    public static void main (String[] args) {
        int num=1234;
        int count=0;
        while(num>0){
            int remainderNumber=num/10;
            count=count+1;
            num=remainderNumber;
        }
         System.out.println(count);
    }   
}