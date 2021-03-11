import java.util.*;
import java.lang.*;

public class Exercise3 {
	
	public static void getSorted(int a[]) {
		int n=a.length;
		ArrayList<String> arrlist = new ArrayList<String>(5);
		for(int num:a) {
			
			String s=String.valueOf(num);
			
			 char ch[]=s.toCharArray();  
			    String rev="";  
			 for(int i=ch.length-1;i>=0;i--){  
			    rev+=ch[i]; 
			 }
			 arrlist.add(rev);
			
		}
		Collections.sort(arrlist);
		System.out.println(arrlist);
		
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
    
	getSorted(a);
	}

}
