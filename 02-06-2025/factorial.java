class Main {
    public static void main(String[] args) {
        int n=6;
        int count = 0;
        for (int i= 1;i <= n;i++){
           if(n % i == 0){
            count ++;
           }
        }
        if (count == 3){
        System.out.println("exactly have by 3 factroial");
        }
        else{
        System.out.println("not exactly have by 3 factroial");
        }
    }
}