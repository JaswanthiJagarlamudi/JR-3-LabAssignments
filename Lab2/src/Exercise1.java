import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
	
	public static int getSecondSmallest(int a[]) {
		Arrays.sort(a);
		return a[1];
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int N=sc.nextInt();
		int a[]=new int[N];
		System.out.println("Enter the integers of the array");
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
    
	System.out.println("Second Smallest Element:"+getSecondSmallest(a));
	}

}
