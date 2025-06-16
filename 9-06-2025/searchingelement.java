 public class App{
    public static void main(String[] args){
        int[] nums = {10,19,2,3,7,8,20,4};
        int target = 20;
        int index = -1;
        for(int i = 0; i< nums.length; i ++){
            if(target == nums[i])
            index = i;
        }
        System.out.println(index == -1?"element is not found": "element is found at index :" + index);
    }
   
    
}