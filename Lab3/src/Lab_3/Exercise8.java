package Lab_3;

import java.util.Scanner;

public class Exercise8 {
	public static boolean checkString(String s) {
		int flag=0;
		for(int i=0;i<(s.length()-1);i++) {
			if(s.charAt(i)>s.charAt(i+1)) { 
				flag=1;
			    break;
			}   
		}
		if(flag==1)
			return false;
		else
			return true;
					
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		
		System.out.println(checkString(s));
	}

}
