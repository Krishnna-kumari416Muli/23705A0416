public class Main{
    public static void main(String[] args){
        int nums[]={1,2,3,42,3,42,5,5,5};
        int count= 0;
        int n=5;
        for(int i=0;i<=nums.length-1;i++){
            if (nums[i]==n){
                count++;
            }
        }
        System.out.println(count);
    }
}
    