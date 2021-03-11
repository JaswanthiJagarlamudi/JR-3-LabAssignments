import java.util.Scanner;

public class Lab1_4 {
	static boolean checkNumber(int N) {
		while(N%2==0)
		 {
		 N=N/2;
		 }
		 if(N==1)
		   return true;
		 else
		   return false;
		 
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int N=s.nextInt();
        System.out.println(checkNumber(N));

	}

}
