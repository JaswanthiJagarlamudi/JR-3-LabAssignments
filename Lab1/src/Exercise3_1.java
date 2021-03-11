import java.util.Scanner;

public class Exercise3_1 {

	static int fibonacci(int n) 
    { 
        
        int f[]=new int[n+1]; 
        f[1] = 1; 
        f[2] = 1;
        if (n > 0) { 
             
              for (int i = 3; i <= n; i++) { 
                
                f[i] = f[i - 1] + f[i - 2]; 
            } 
        } 
  
        return f[n]; 
    } 
  
    public static void main(String args[]) 
    { 
    	Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt(); 
        System.out.println(fibonacci(n)); 
    } 
}
