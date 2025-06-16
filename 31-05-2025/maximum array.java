class Main {
    public static void main (String[] args) {
        int[] nums={3,6,6,10,12,2};
        int max=nums[0];
       
        for( int i=0; i <= nums.length-1; i++){
            int value=nums[i];
            if(value > max){
           max = value;
            
            
            }
        }
        System.out.println( max);
    }
}