import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i= 0;i<n;i++){
	        for(int j = 0 ; j < 2*n-1;j++){
	            if(i+ j >=n-1 && j-1<= n-1){
	            System.out.println(" * ");
	            }
	            else{
	                System.out.println(" ");
	            }
	        }
	    
		System.out.println();
	    }
    }
}