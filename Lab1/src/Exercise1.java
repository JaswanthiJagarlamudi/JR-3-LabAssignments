import java.util.Scanner;

public class Exercise1 {
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int sum=0,a;
		while(n!=0)
		{
		a = n%10;
		sum = sum +(a*a*a);
		n = n/10;

		}
		System.out.println(sum);

	}

}
