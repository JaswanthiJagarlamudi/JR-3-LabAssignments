import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	public static void sortStrings(String a[]) {
		Arrays.sort(a);
		int size=a.length;
		if (size % 2==0) {
			for(int i=0;i<size/2;i++)
				a[i]=a[i].toUpperCase();
			for(int j=size/2;j<size;j++)
				a[j]=a[j].toLowerCase();
				
		}
		else
			
			for(int i=0;i<=size/2;i++)
				a[i]=a[i].toUpperCase();
			for(int j=(size/2)+1;j<size;j++)
				a[j]=a[j].toLowerCase();
		
			System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int N=sc.nextInt();
		String a[]=new String[N];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<N;i++) {
			a[i]=sc.next();
		}
    
	System.out.println("Sorted array is-------->");
	sortStrings(a);

	}

}
