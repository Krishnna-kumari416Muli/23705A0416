class Main {
    public static void main(String[] args) {
        int num=12332;
        int rev=0;
        int temp=num;
        while(temp>0){
            int digit=temp%10;
            rev=(rev * 10)+digit;
            temp=temp/10;
            
        }
        if(num==rev){
        System.out.println("palindromic");
        }
        else{
            System.out.println("not palindromic");
        }
    }
}