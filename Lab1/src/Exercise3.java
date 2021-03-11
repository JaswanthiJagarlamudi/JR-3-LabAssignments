import java.util.Scanner;

public class Exercise3 {

	
		static int fib(int n) 
	    { 
	        if (n == 2||n == 1) 
	            return 1;
	        
	        return fib(n - 1) + fib(n - 2); 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	    	Scanner s=new Scanner(System.in);
			System.out.println("Enter the number");
			int n=s.nextInt(); 
	        System.out.println(fib(n)); 
	    } 

	}


