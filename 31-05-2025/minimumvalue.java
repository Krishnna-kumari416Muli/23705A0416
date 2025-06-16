class Main {
    public static void main (String[] args) {
        int[] nums={3,6,6,10,12,2};
        int min=nums[0];
       
        for( int i=0; i <= nums.length-1; i++){
            int value=nums[i];
            if(value < min){
           min = value;
            
            
            }
        }
        System.out.println( min);
    }
}